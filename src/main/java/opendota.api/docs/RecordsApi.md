# RecordsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordsFieldGet**](RecordsApi.md#recordsFieldGet) | **GET** /records/{field} | GET /records/{field}


<a name="recordsFieldGet"></a>
# **recordsFieldGet**
> List&lt;InlineResponse20030&gt; recordsFieldGet(field)

GET /records/{field}

Get top performances in a stat

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecordsApi;


RecordsApi apiInstance = new RecordsApi();
String field = "field_example"; // String | Field name to query
try {
    List<InlineResponse20030> result = apiInstance.recordsFieldGet(field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#recordsFieldGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**| Field name to query |

### Return type

[**List&lt;InlineResponse20030&gt;**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

