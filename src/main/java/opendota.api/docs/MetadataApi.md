# MetadataApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metadataGet**](MetadataApi.md#metadataGet) | **GET** /metadata | GET /metadata


<a name="metadataGet"></a>
# **metadataGet**
> InlineResponse20016 metadataGet()

GET /metadata

Site metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetadataApi;


MetadataApi apiInstance = new MetadataApi();
try {
    InlineResponse20016 result = apiInstance.metadataGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataApi#metadataGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

