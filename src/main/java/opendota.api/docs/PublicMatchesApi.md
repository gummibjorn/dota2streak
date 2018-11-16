# PublicMatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMatchesGet**](PublicMatchesApi.md#publicMatchesGet) | **GET** /publicMatches | GET /publicMatches


<a name="publicMatchesGet"></a>
# **publicMatchesGet**
> List&lt;InlineResponse20015&gt; publicMatchesGet(mmrAscending, mmrDescending, lessThanMatchId)

GET /publicMatches

Get list of randomly sampled public matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicMatchesApi;


PublicMatchesApi apiInstance = new PublicMatchesApi();
Integer mmrAscending = 56; // Integer | Order by MMR ascending
Integer mmrDescending = 56; // Integer | Order by MMR descending
Integer lessThanMatchId = 56; // Integer | Get matches with a match ID lower than this value
try {
    List<InlineResponse20015> result = apiInstance.publicMatchesGet(mmrAscending, mmrDescending, lessThanMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicMatchesApi#publicMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmrAscending** | **Integer**| Order by MMR ascending | [optional]
 **mmrDescending** | **Integer**| Order by MMR descending | [optional]
 **lessThanMatchId** | **Integer**| Get matches with a match ID lower than this value | [optional]

### Return type

[**List&lt;InlineResponse20015&gt;**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

