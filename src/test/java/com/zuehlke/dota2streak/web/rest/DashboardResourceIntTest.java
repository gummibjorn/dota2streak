package com.zuehlke.dota2streak.web.rest;

import com.zuehlke.dota2streak.Dota2StreakApp;

import com.zuehlke.dota2streak.domain.Dashboard;
import com.zuehlke.dota2streak.repository.DashboardRepository;
import com.zuehlke.dota2streak.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


import static com.zuehlke.dota2streak.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the DashboardResource REST controller.
 *
 * @see DashboardResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Dota2StreakApp.class)
public class DashboardResourceIntTest {

    @Autowired
    private DashboardRepository dashboardRepository;

    @Mock
    private DashboardRepository dashboardRepositoryMock;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restDashboardMockMvc;

    private Dashboard dashboard;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final DashboardResource dashboardResource = new DashboardResource(dashboardRepository);
        this.restDashboardMockMvc = MockMvcBuilders.standaloneSetup(dashboardResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Dashboard createEntity(EntityManager em) {
        Dashboard dashboard = new Dashboard();
        return dashboard;
    }

    @Before
    public void initTest() {
        dashboard = createEntity(em);
    }

    @Test
    @Transactional
    public void createDashboard() throws Exception {
        int databaseSizeBeforeCreate = dashboardRepository.findAll().size();

        // Create the Dashboard
        restDashboardMockMvc.perform(post("/api/dashboards")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(dashboard)))
            .andExpect(status().isCreated());

        // Validate the Dashboard in the database
        List<Dashboard> dashboardList = dashboardRepository.findAll();
        assertThat(dashboardList).hasSize(databaseSizeBeforeCreate + 1);
        Dashboard testDashboard = dashboardList.get(dashboardList.size() - 1);
    }

    @Test
    @Transactional
    public void createDashboardWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = dashboardRepository.findAll().size();

        // Create the Dashboard with an existing ID
        dashboard.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restDashboardMockMvc.perform(post("/api/dashboards")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(dashboard)))
            .andExpect(status().isBadRequest());

        // Validate the Dashboard in the database
        List<Dashboard> dashboardList = dashboardRepository.findAll();
        assertThat(dashboardList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllDashboards() throws Exception {
        // Initialize the database
        dashboardRepository.saveAndFlush(dashboard);

        // Get all the dashboardList
        restDashboardMockMvc.perform(get("/api/dashboards?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(dashboard.getId().intValue())));
    }
    
    @SuppressWarnings({"unchecked"})
    public void getAllDashboardsWithEagerRelationshipsIsEnabled() throws Exception {
        DashboardResource dashboardResource = new DashboardResource(dashboardRepositoryMock);
        when(dashboardRepositoryMock.findAllWithEagerRelationships(any())).thenReturn(new PageImpl(new ArrayList<>()));

        MockMvc restDashboardMockMvc = MockMvcBuilders.standaloneSetup(dashboardResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();

        restDashboardMockMvc.perform(get("/api/dashboards?eagerload=true"))
        .andExpect(status().isOk());

        verify(dashboardRepositoryMock, times(1)).findAllWithEagerRelationships(any());
    }

    @SuppressWarnings({"unchecked"})
    public void getAllDashboardsWithEagerRelationshipsIsNotEnabled() throws Exception {
        DashboardResource dashboardResource = new DashboardResource(dashboardRepositoryMock);
            when(dashboardRepositoryMock.findAllWithEagerRelationships(any())).thenReturn(new PageImpl(new ArrayList<>()));
            MockMvc restDashboardMockMvc = MockMvcBuilders.standaloneSetup(dashboardResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();

        restDashboardMockMvc.perform(get("/api/dashboards?eagerload=true"))
        .andExpect(status().isOk());

            verify(dashboardRepositoryMock, times(1)).findAllWithEagerRelationships(any());
    }

    @Test
    @Transactional
    public void getDashboard() throws Exception {
        // Initialize the database
        dashboardRepository.saveAndFlush(dashboard);

        // Get the dashboard
        restDashboardMockMvc.perform(get("/api/dashboards/{id}", dashboard.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(dashboard.getId().intValue()));
    }

    @Test
    @Transactional
    public void getNonExistingDashboard() throws Exception {
        // Get the dashboard
        restDashboardMockMvc.perform(get("/api/dashboards/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateDashboard() throws Exception {
        // Initialize the database
        dashboardRepository.saveAndFlush(dashboard);

        int databaseSizeBeforeUpdate = dashboardRepository.findAll().size();

        // Update the dashboard
        Dashboard updatedDashboard = dashboardRepository.findById(dashboard.getId()).get();
        // Disconnect from session so that the updates on updatedDashboard are not directly saved in db
        em.detach(updatedDashboard);

        restDashboardMockMvc.perform(put("/api/dashboards")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedDashboard)))
            .andExpect(status().isOk());

        // Validate the Dashboard in the database
        List<Dashboard> dashboardList = dashboardRepository.findAll();
        assertThat(dashboardList).hasSize(databaseSizeBeforeUpdate);
        Dashboard testDashboard = dashboardList.get(dashboardList.size() - 1);
    }

    @Test
    @Transactional
    public void updateNonExistingDashboard() throws Exception {
        int databaseSizeBeforeUpdate = dashboardRepository.findAll().size();

        // Create the Dashboard

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDashboardMockMvc.perform(put("/api/dashboards")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(dashboard)))
            .andExpect(status().isBadRequest());

        // Validate the Dashboard in the database
        List<Dashboard> dashboardList = dashboardRepository.findAll();
        assertThat(dashboardList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteDashboard() throws Exception {
        // Initialize the database
        dashboardRepository.saveAndFlush(dashboard);

        int databaseSizeBeforeDelete = dashboardRepository.findAll().size();

        // Get the dashboard
        restDashboardMockMvc.perform(delete("/api/dashboards/{id}", dashboard.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Dashboard> dashboardList = dashboardRepository.findAll();
        assertThat(dashboardList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Dashboard.class);
        Dashboard dashboard1 = new Dashboard();
        dashboard1.setId(1L);
        Dashboard dashboard2 = new Dashboard();
        dashboard2.setId(dashboard1.getId());
        assertThat(dashboard1).isEqualTo(dashboard2);
        dashboard2.setId(2L);
        assertThat(dashboard1).isNotEqualTo(dashboard2);
        dashboard1.setId(null);
        assertThat(dashboard1).isNotEqualTo(dashboard2);
    }
}
