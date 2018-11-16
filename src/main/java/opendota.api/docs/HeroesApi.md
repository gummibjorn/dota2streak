# HeroesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**heroesGet**](HeroesApi.md#heroesGet) | **GET** /heroes | GET /heroes
[**heroesHeroIdDurationsGet**](HeroesApi.md#heroesHeroIdDurationsGet) | **GET** /heroes/{hero_id}/durations | GET /heroes/{hero_id}/durations
[**heroesHeroIdMatchesGet**](HeroesApi.md#heroesHeroIdMatchesGet) | **GET** /heroes/{hero_id}/matches | GET /heroes/{hero_id}/matches
[**heroesHeroIdMatchupsGet**](HeroesApi.md#heroesHeroIdMatchupsGet) | **GET** /heroes/{hero_id}/matchups | GET /heroes/{hero_id}/matchups
[**heroesHeroIdPlayersGet**](HeroesApi.md#heroesHeroIdPlayersGet) | **GET** /heroes/{hero_id}/players | GET /heroes/{hero_id}/players


<a name="heroesGet"></a>
# **heroesGet**
> List&lt;InlineResponse20021&gt; heroesGet()

GET /heroes

Get hero data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroesApi;


HeroesApi apiInstance = new HeroesApi();
try {
    List<InlineResponse20021> result = apiInstance.heroesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroesApi#heroesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20021&gt;**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdDurationsGet"></a>
# **heroesHeroIdDurationsGet**
> List&lt;InlineResponse20024&gt; heroesHeroIdDurationsGet(heroId)

GET /heroes/{hero_id}/durations

Get hero performance over a range of match durations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroesApi;


HeroesApi apiInstance = new HeroesApi();
Integer heroId = 56; // Integer | Hero ID
try {
    List<InlineResponse20024> result = apiInstance.heroesHeroIdDurationsGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroesApi#heroesHeroIdDurationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **Integer**| Hero ID |

### Return type

[**List&lt;InlineResponse20024&gt;**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdMatchesGet"></a>
# **heroesHeroIdMatchesGet**
> List&lt;InlineResponse20014&gt; heroesHeroIdMatchesGet(heroId)

GET /heroes/{hero_id}/matches

Get recent matches with a hero

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroesApi;


HeroesApi apiInstance = new HeroesApi();
Integer heroId = 56; // Integer | Hero ID
try {
    List<InlineResponse20014> result = apiInstance.heroesHeroIdMatchesGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroesApi#heroesHeroIdMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **Integer**| Hero ID |

### Return type

[**List&lt;InlineResponse20014&gt;**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdMatchupsGet"></a>
# **heroesHeroIdMatchupsGet**
> List&lt;InlineResponse20023&gt; heroesHeroIdMatchupsGet(heroId)

GET /heroes/{hero_id}/matchups

Get results against other heroes for a hero

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroesApi;


HeroesApi apiInstance = new HeroesApi();
Integer heroId = 56; // Integer | Hero ID
try {
    List<InlineResponse20023> result = apiInstance.heroesHeroIdMatchupsGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroesApi#heroesHeroIdMatchupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **Integer**| Hero ID |

### Return type

[**List&lt;InlineResponse20023&gt;**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdPlayersGet"></a>
# **heroesHeroIdPlayersGet**
> List&lt;List&lt;Object&gt;&gt; heroesHeroIdPlayersGet(heroId)

GET /heroes/{hero_id}/players

Get players who have played this hero

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroesApi;


HeroesApi apiInstance = new HeroesApi();
Integer heroId = 56; // Integer | Hero ID
try {
    List<List<Object>> result = apiInstance.heroesHeroIdPlayersGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroesApi#heroesHeroIdPlayersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **Integer**| Hero ID |

### Return type

[**List&lt;List&lt;Object&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

