# TeamsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsGet**](TeamsApi.md#teamsGet) | **GET** /teams | GET /teams
[**teamsTeamIdGet**](TeamsApi.md#teamsTeamIdGet) | **GET** /teams/{team_id} | GET /teams/{team_id}
[**teamsTeamIdHeroesGet**](TeamsApi.md#teamsTeamIdHeroesGet) | **GET** /teams/{team_id}/heroes | GET /teams/{team_id}/heroes
[**teamsTeamIdMatchesGet**](TeamsApi.md#teamsTeamIdMatchesGet) | **GET** /teams/{team_id}/matches | GET /teams/{team_id}/matches
[**teamsTeamIdPlayersGet**](TeamsApi.md#teamsTeamIdPlayersGet) | **GET** /teams/{team_id}/players | GET /teams/{team_id}/players


<a name="teamsGet"></a>
# **teamsGet**
> List&lt;InlineResponse20026&gt; teamsGet()

GET /teams

Get team data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
try {
    List<InlineResponse20026> result = apiInstance.teamsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20026&gt;**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdGet"></a>
# **teamsTeamIdGet**
> InlineResponse20026 teamsTeamIdGet(teamId)

GET /teams/{team_id}

Get data for a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer teamId = 56; // Integer | Team ID
try {
    InlineResponse20026 result = apiInstance.teamsTeamIdGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Integer**| Team ID |

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdHeroesGet"></a>
# **teamsTeamIdHeroesGet**
> InlineResponse20028 teamsTeamIdHeroesGet(teamId)

GET /teams/{team_id}/heroes

Get heroes for a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer teamId = 56; // Integer | Team ID
try {
    InlineResponse20028 result = apiInstance.teamsTeamIdHeroesGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdHeroesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Integer**| Team ID |

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdMatchesGet"></a>
# **teamsTeamIdMatchesGet**
> InlineResponse20014 teamsTeamIdMatchesGet(teamId)

GET /teams/{team_id}/matches

Get matches for a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer teamId = 56; // Integer | Team ID
try {
    InlineResponse20014 result = apiInstance.teamsTeamIdMatchesGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Integer**| Team ID |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdPlayersGet"></a>
# **teamsTeamIdPlayersGet**
> InlineResponse20027 teamsTeamIdPlayersGet(teamId)

GET /teams/{team_id}/players

Get players who have played for a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer teamId = 56; // Integer | Team ID
try {
    InlineResponse20027 result = apiInstance.teamsTeamIdPlayersGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdPlayersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Integer**| Team ID |

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

