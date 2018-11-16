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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveApi
 */
@Ignore
public class LiveApiTest {

    private final LiveApi api = new LiveApi();

    
    /**
     * GET /live
     *
     * Get top currently ongoing live games
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void liveGetTest() throws ApiException {
        List<Object> response = api.liveGet();

        // TODO: test validations
    }
    
}
