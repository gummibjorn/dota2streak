# RankingsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rankingsGet**](RankingsApi.md#rankingsGet) | **GET** /rankings | GET /rankings


<a name="rankingsGet"></a>
# **rankingsGet**
> InlineResponse20019 rankingsGet(heroId)

GET /rankings

Top players by hero

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RankingsApi;


RankingsApi apiInstance = new RankingsApi();
String heroId = "heroId_example"; // String | Hero ID
try {
    InlineResponse20019 result = apiInstance.rankingsGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankingsApi#rankingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **String**| Hero ID |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

