# HealthApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthGet**](HealthApi.md#healthGet) | **GET** /health | GET /health


<a name="healthGet"></a>
# **healthGet**
> Object healthGet()

GET /health

Get service health data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
try {
    Object result = apiInstance.healthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#healthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

