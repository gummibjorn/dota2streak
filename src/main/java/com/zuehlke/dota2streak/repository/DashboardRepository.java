package com.zuehlke.dota2streak.repository;

import com.zuehlke.dota2streak.domain.Dashboard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Dashboard entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

    @Query(value = "select distinct dashboard from Dashboard dashboard left join fetch dashboard.players",
        countQuery = "select count(distinct dashboard) from Dashboard dashboard")
    Page<Dashboard> findAllWithEagerRelationships(Pageable pageable);

    @Query(value = "select distinct dashboard from Dashboard dashboard left join fetch dashboard.players")
    List<Dashboard> findAllWithEagerRelationships();

    @Query("select dashboard from Dashboard dashboard left join fetch dashboard.players where dashboard.id =:id")
    Optional<Dashboard> findOneWithEagerRelationships(@Param("id") Long id);

}
