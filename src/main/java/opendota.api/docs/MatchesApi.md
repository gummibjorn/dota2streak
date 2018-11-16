# MatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matchesMatchIdGet**](MatchesApi.md#matchesMatchIdGet) | **GET** /matches/{match_id} | GET /matches/{match_id}


<a name="matchesMatchIdGet"></a>
# **matchesMatchIdGet**
> InlineResponse200 matchesMatchIdGet(matchId)

GET /matches/{match_id}

Match data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MatchesApi;


MatchesApi apiInstance = new MatchesApi();
Integer matchId = 56; // Integer | 
try {
    InlineResponse200 result = apiInstance.matchesMatchIdGet(matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchesApi#matchesMatchIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Integer**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

