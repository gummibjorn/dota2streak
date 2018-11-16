# BenchmarksApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**benchmarksGet**](BenchmarksApi.md#benchmarksGet) | **GET** /benchmarks | GET /benchmarks


<a name="benchmarksGet"></a>
# **benchmarksGet**
> InlineResponse20020 benchmarksGet(heroId)

GET /benchmarks

Benchmarks of average stat values for a hero

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BenchmarksApi;


BenchmarksApi apiInstance = new BenchmarksApi();
String heroId = "heroId_example"; // String | Hero ID
try {
    InlineResponse20020 result = apiInstance.benchmarksGet(heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarksApi#benchmarksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **String**| Hero ID |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

