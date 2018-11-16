# DistributionsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distributionsGet**](DistributionsApi.md#distributionsGet) | **GET** /distributions | GET /distributions


<a name="distributionsGet"></a>
# **distributionsGet**
> InlineResponse20017 distributionsGet()

GET /distributions

Distributions of MMR data by bracket and country

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DistributionsApi;


DistributionsApi apiInstance = new DistributionsApi();
try {
    InlineResponse20017 result = apiInstance.distributionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionsApi#distributionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

