# HeroStatsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**heroStatsGet**](HeroStatsApi.md#heroStatsGet) | **GET** /heroStats | GET /heroStats


<a name="heroStatsGet"></a>
# **heroStatsGet**
> List&lt;InlineResponse20022&gt; heroStatsGet()

GET /heroStats

Get stats about hero performance in recent matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HeroStatsApi;


HeroStatsApi apiInstance = new HeroStatsApi();
try {
    List<InlineResponse20022> result = apiInstance.heroStatsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HeroStatsApi#heroStatsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20022&gt;**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

