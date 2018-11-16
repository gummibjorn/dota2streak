# StatusApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiMetricsGet**](StatusApi.md#adminApiMetricsGet) | **GET** /admin/apiMetrics | GET /admin/apiMetrics
[**statusGet**](StatusApi.md#statusGet) | **GET** /status | GET /status


<a name="adminApiMetricsGet"></a>
# **adminApiMetricsGet**
> Object adminApiMetricsGet()

GET /admin/apiMetrics

Get API request metrics

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    Object result = apiInstance.adminApiMetricsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#adminApiMetricsGet");
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

<a name="statusGet"></a>
# **statusGet**
> Object statusGet()

GET /status

Get current service statistics

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    Object result = apiInstance.statusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#statusGet");
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

