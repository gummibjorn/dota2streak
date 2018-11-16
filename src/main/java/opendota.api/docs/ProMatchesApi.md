# ProMatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**proMatchesGet**](ProMatchesApi.md#proMatchesGet) | **GET** /proMatches | GET /proMatches


<a name="proMatchesGet"></a>
# **proMatchesGet**
> List&lt;InlineResponse20014&gt; proMatchesGet(lessThanMatchId)

GET /proMatches

Get list of pro matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProMatchesApi;


ProMatchesApi apiInstance = new ProMatchesApi();
Integer lessThanMatchId = 56; // Integer | Get matches with a match ID lower than this value
try {
    List<InlineResponse20014> result = apiInstance.proMatchesGet(lessThanMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProMatchesApi#proMatchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessThanMatchId** | **Integer**| Get matches with a match ID lower than this value | [optional]

### Return type

[**List&lt;InlineResponse20014&gt;**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

