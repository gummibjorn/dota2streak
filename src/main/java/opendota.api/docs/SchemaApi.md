# SchemaApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SchemaApi.md#schemaGet) | **GET** /schema | GET /schema


<a name="schemaGet"></a>
# **schemaGet**
> List&lt;InlineResponse20034&gt; schemaGet()

GET /schema

Get database schema

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchemaApi;


SchemaApi apiInstance = new SchemaApi();
try {
    List<InlineResponse20034> result = apiInstance.schemaGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemaApi#schemaGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20034&gt;**](InlineResponse20034.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

