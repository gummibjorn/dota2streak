# PlayersApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playersAccountIdCountsGet**](PlayersApi.md#playersAccountIdCountsGet) | **GET** /players/{account_id}/counts | GET /players/{account_id}/counts
[**playersAccountIdGet**](PlayersApi.md#playersAccountIdGet) | **GET** /players/{account_id} | GET /players/{account_id}
[**playersAccountIdHeroesGet**](PlayersApi.md#playersAccountIdHeroesGet) | **GET** /players/{account_id}/heroes | GET /players/{account_id}/heroes
[**playersAccountIdHistogramsFieldGet**](PlayersApi.md#playersAccountIdHistogramsFieldGet) | **GET** /players/{account_id}/histograms/{field} | GET /players/{account_id}/histograms
[**playersAccountIdMatchesGet**](PlayersApi.md#playersAccountIdMatchesGet) | **GET** /players/{account_id}/matches | GET /players/{account_id}/matches
[**playersAccountIdPeersGet**](PlayersApi.md#playersAccountIdPeersGet) | **GET** /players/{account_id}/peers | GET /players/{account_id}/peers
[**playersAccountIdProsGet**](PlayersApi.md#playersAccountIdProsGet) | **GET** /players/{account_id}/pros | GET /players/{account_id}/pros
[**playersAccountIdRankingsGet**](PlayersApi.md#playersAccountIdRankingsGet) | **GET** /players/{account_id}/rankings | GET /players/{account_id}/rankings
[**playersAccountIdRatingsGet**](PlayersApi.md#playersAccountIdRatingsGet) | **GET** /players/{account_id}/ratings | GET /players/{account_id}/ratings
[**playersAccountIdRecentMatchesGet**](PlayersApi.md#playersAccountIdRecentMatchesGet) | **GET** /players/{account_id}/recentMatches | GET /players/{account_id}/recentMatches
[**playersAccountIdRefreshPost**](PlayersApi.md#playersAccountIdRefreshPost) | **POST** /players/{account_id}/refresh | POST /players/{account_id}/refresh
[**playersAccountIdTotalsGet**](PlayersApi.md#playersAccountIdTotalsGet) | **GET** /players/{account_id}/totals | GET /players/{account_id}/totals
[**playersAccountIdWardmapGet**](PlayersApi.md#playersAccountIdWardmapGet) | **GET** /players/{account_id}/wardmap | GET /players/{account_id}/wardmap
[**playersAccountIdWlGet**](PlayersApi.md#playersAccountIdWlGet) | **GET** /players/{account_id}/wl | GET /players/{account_id}/wl
[**playersAccountIdWordcloudGet**](PlayersApi.md#playersAccountIdWordcloudGet) | **GET** /players/{account_id}/wordcloud | GET /players/{account_id}/wordcloud


<a name="playersAccountIdCountsGet"></a>
# **playersAccountIdCountsGet**
> InlineResponse2009 playersAccountIdCountsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/counts

Counts in categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    InlineResponse2009 result = apiInstance.playersAccountIdCountsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdCountsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdGet"></a>
# **playersAccountIdGet**
> InlineResponse2001 playersAccountIdGet(accountId)

GET /players/{account_id}

Player data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
try {
    InlineResponse2001 result = apiInstance.playersAccountIdGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdHeroesGet"></a>
# **playersAccountIdHeroesGet**
> List&lt;InlineResponse2005&gt; playersAccountIdHeroesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/heroes

Heroes played

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    List<InlineResponse2005> result = apiInstance.playersAccountIdHeroesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdHeroesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**List&lt;InlineResponse2005&gt;**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdHistogramsFieldGet"></a>
# **playersAccountIdHistogramsFieldGet**
> List&lt;Object&gt; playersAccountIdHistogramsFieldGet(accountId, field, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/histograms

Distribution of matches in a single stat

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
String field = "field_example"; // String | Field to aggregate on
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    List<Object> result = apiInstance.playersAccountIdHistogramsFieldGet(accountId, field, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdHistogramsFieldGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **field** | **String**| Field to aggregate on |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdMatchesGet"></a>
# **playersAccountIdMatchesGet**
> List&lt;InlineResponse2004&gt; playersAccountIdMatchesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort, project)

GET /players/{account_id}/matches

Matches played

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
String project = "project_example"; // String | Fields to project (array)
try {
    List<InlineResponse2004> result = apiInstance.playersAccountIdMatchesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort, project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]
 **project** | **String**| Fields to project (array) | [optional]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdPeersGet"></a>
# **playersAccountIdPeersGet**
> List&lt;InlineResponse2006&gt; playersAccountIdPeersGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/peers

Players played with

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    List<InlineResponse2006> result = apiInstance.playersAccountIdPeersGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdPeersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**List&lt;InlineResponse2006&gt;**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdProsGet"></a>
# **playersAccountIdProsGet**
> List&lt;InlineResponse2007&gt; playersAccountIdProsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/pros

Pro players played with

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    List<InlineResponse2007> result = apiInstance.playersAccountIdProsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdProsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**List&lt;InlineResponse2007&gt;**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRankingsGet"></a>
# **playersAccountIdRankingsGet**
> List&lt;Object&gt; playersAccountIdRankingsGet(accountId)

GET /players/{account_id}/rankings

Player hero rankings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
try {
    List<Object> result = apiInstance.playersAccountIdRankingsGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdRankingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRatingsGet"></a>
# **playersAccountIdRatingsGet**
> List&lt;InlineResponse20012&gt; playersAccountIdRatingsGet(accountId)

GET /players/{account_id}/ratings

Player rating history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
try {
    List<InlineResponse20012> result = apiInstance.playersAccountIdRatingsGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdRatingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |

### Return type

[**List&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRecentMatchesGet"></a>
# **playersAccountIdRecentMatchesGet**
> List&lt;InlineResponse2003&gt; playersAccountIdRecentMatchesGet(accountId)

GET /players/{account_id}/recentMatches

Recent matches played

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
try {
    List<InlineResponse2003> result = apiInstance.playersAccountIdRecentMatchesGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdRecentMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRefreshPost"></a>
# **playersAccountIdRefreshPost**
> Object playersAccountIdRefreshPost(accountId)

POST /players/{account_id}/refresh

Refresh player match history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
try {
    Object result = apiInstance.playersAccountIdRefreshPost(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdRefreshPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdTotalsGet"></a>
# **playersAccountIdTotalsGet**
> List&lt;InlineResponse2008&gt; playersAccountIdTotalsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/totals

Totals in stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    List<InlineResponse2008> result = apiInstance.playersAccountIdTotalsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdTotalsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**List&lt;InlineResponse2008&gt;**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWardmapGet"></a>
# **playersAccountIdWardmapGet**
> InlineResponse20010 playersAccountIdWardmapGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wardmap

Wards placed in matches played

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    InlineResponse20010 result = apiInstance.playersAccountIdWardmapGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdWardmapGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWlGet"></a>
# **playersAccountIdWlGet**
> InlineResponse2002 playersAccountIdWlGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wl

Win/Loss count

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    InlineResponse2002 result = apiInstance.playersAccountIdWlGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdWlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWordcloudGet"></a>
# **playersAccountIdWordcloudGet**
> InlineResponse20011 playersAccountIdWordcloudGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wordcloud

Words said/read in matches played

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayersApi;


PlayersApi apiInstance = new PlayersApi();
Integer accountId = 56; // Integer | Steam32 account ID
Integer limit = 56; // Integer | Number of matches to limit to
Integer offset = 56; // Integer | Number of matches to offset start by
Integer win = 56; // Integer | Whether the player won
Integer patch = 56; // Integer | Patch ID
Integer gameMode = 56; // Integer | Game Mode ID
Integer lobbyType = 56; // Integer | Lobby type ID
Integer region = 56; // Integer | Region ID
Integer date = 56; // Integer | Days previous
Integer laneRole = 56; // Integer | Lane Role ID
Integer heroId = 56; // Integer | Hero ID
Integer isRadiant = 56; // Integer | Whether the player was radiant
Integer includedAccountId = 56; // Integer | Account IDs in the match (array)
Integer excludedAccountId = 56; // Integer | Account IDs not in the match (array)
Integer withHeroId = 56; // Integer | Hero IDs on the player's team (array)
Integer againstHeroId = 56; // Integer | Hero IDs against the player's team (array)
Integer significant = 56; // Integer | Whether the match was significant for aggregation purposes
Integer having = 56; // Integer | The minimum number of games played, for filtering hero stats
String sort = "sort_example"; // String | The field to return matches sorted by in descending order
try {
    InlineResponse20011 result = apiInstance.playersAccountIdWordcloudGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#playersAccountIdWordcloudGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Steam32 account ID |
 **limit** | **Integer**| Number of matches to limit to | [optional]
 **offset** | **Integer**| Number of matches to offset start by | [optional]
 **win** | **Integer**| Whether the player won | [optional]
 **patch** | **Integer**| Patch ID | [optional]
 **gameMode** | **Integer**| Game Mode ID | [optional]
 **lobbyType** | **Integer**| Lobby type ID | [optional]
 **region** | **Integer**| Region ID | [optional]
 **date** | **Integer**| Days previous | [optional]
 **laneRole** | **Integer**| Lane Role ID | [optional]
 **heroId** | **Integer**| Hero ID | [optional]
 **isRadiant** | **Integer**| Whether the player was radiant | [optional]
 **includedAccountId** | **Integer**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **Integer**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **Integer**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **Integer**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **Integer**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **Integer**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

