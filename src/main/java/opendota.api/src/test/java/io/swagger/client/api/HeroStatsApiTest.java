/*
 * OpenDota API
 * # Introduction The OpenDota API provides Dota 2 related data including advanced match data extracted from match replays.  **Beginning 2018-04-22, the OpenDota API is limited to 50,000 free calls per month and 60 requests/minute** We offer a Premium Tier with unlimited API calls and higher rate limits. Check out the [API page](https://www.opendota.com/api-keys) to learn more. 
 *
 * OpenAPI spec version: 17.6.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse20022;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HeroStatsApi
 */
@Ignore
public class HeroStatsApiTest {

    private final HeroStatsApi api = new HeroStatsApi();

    
    /**
     * GET /heroStats
     *
     * Get stats about hero performance in recent matches
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void heroStatsGetTest() throws ApiException {
        List<InlineResponse20022> response = api.heroStatsGet();

        // TODO: test validations
    }
    
}
