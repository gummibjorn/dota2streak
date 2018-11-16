# LiveApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**liveGet**](LiveApi.md#liveGet) | **GET** /live | GET /live


<a name="liveGet"></a>
# **liveGet**
> List&lt;Object&gt; liveGet()

GET /live

Get top currently ongoing live games

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LiveApi;


LiveApi apiInstance = new LiveApi();
try {
    List<Object> result = apiInstance.liveGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LiveApi#liveGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

