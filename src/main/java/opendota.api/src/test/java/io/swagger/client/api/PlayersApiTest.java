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
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse20010;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.InlineResponse2009;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayersApi
 */
@Ignore
public class PlayersApiTest {

    private final PlayersApi api = new PlayersApi();

    
    /**
     * GET /players/{account_id}/counts
     *
     * Counts in categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdCountsGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        InlineResponse2009 response = api.playersAccountIdCountsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}
     *
     * Player data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdGetTest() throws ApiException {
        Integer accountId = null;
        InlineResponse2001 response = api.playersAccountIdGet(accountId);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/heroes
     *
     * Heroes played
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdHeroesGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        List<InlineResponse2005> response = api.playersAccountIdHeroesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/histograms
     *
     * Distribution of matches in a single stat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdHistogramsFieldGetTest() throws ApiException {
        Integer accountId = null;
        String field = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        List<Object> response = api.playersAccountIdHistogramsFieldGet(accountId, field, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/matches
     *
     * Matches played
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdMatchesGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        String project = null;
        List<InlineResponse2004> response = api.playersAccountIdMatchesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort, project);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/peers
     *
     * Players played with
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdPeersGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        List<InlineResponse2006> response = api.playersAccountIdPeersGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/pros
     *
     * Pro players played with
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdProsGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        List<InlineResponse2007> response = api.playersAccountIdProsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/rankings
     *
     * Player hero rankings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdRankingsGetTest() throws ApiException {
        Integer accountId = null;
        List<Object> response = api.playersAccountIdRankingsGet(accountId);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/ratings
     *
     * Player rating history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdRatingsGetTest() throws ApiException {
        Integer accountId = null;
        List<InlineResponse20012> response = api.playersAccountIdRatingsGet(accountId);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/recentMatches
     *
     * Recent matches played
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdRecentMatchesGetTest() throws ApiException {
        Integer accountId = null;
        List<InlineResponse2003> response = api.playersAccountIdRecentMatchesGet(accountId);

        // TODO: test validations
    }
    
    /**
     * POST /players/{account_id}/refresh
     *
     * Refresh player match history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdRefreshPostTest() throws ApiException {
        Integer accountId = null;
        Object response = api.playersAccountIdRefreshPost(accountId);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/totals
     *
     * Totals in stats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdTotalsGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        List<InlineResponse2008> response = api.playersAccountIdTotalsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/wardmap
     *
     * Wards placed in matches played
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdWardmapGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        InlineResponse20010 response = api.playersAccountIdWardmapGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/wl
     *
     * Win/Loss count
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdWlGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        InlineResponse2002 response = api.playersAccountIdWlGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
    /**
     * GET /players/{account_id}/wordcloud
     *
     * Words said/read in matches played
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void playersAccountIdWordcloudGetTest() throws ApiException {
        Integer accountId = null;
        Integer limit = null;
        Integer offset = null;
        Integer win = null;
        Integer patch = null;
        Integer gameMode = null;
        Integer lobbyType = null;
        Integer region = null;
        Integer date = null;
        Integer laneRole = null;
        Integer heroId = null;
        Integer isRadiant = null;
        Integer includedAccountId = null;
        Integer excludedAccountId = null;
        Integer withHeroId = null;
        Integer againstHeroId = null;
        Integer significant = null;
        Integer having = null;
        String sort = null;
        InlineResponse20011 response = api.playersAccountIdWordcloudGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);

        // TODO: test validations
    }
    
}
