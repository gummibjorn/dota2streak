# ExplorerApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**explorerGet**](ExplorerApi.md#explorerGet) | **GET** /explorer | GET /explorer


<a name="explorerGet"></a>
# **explorerGet**
> Object explorerGet(sql)

GET /explorer

Submit arbitrary SQL queries to the database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExplorerApi;


ExplorerApi apiInstance = new ExplorerApi();
String sql = "sql_example"; // String | The PostgreSQL query as percent-encoded string.
try {
    Object result = apiInstance.explorerGet(sql);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerApi#explorerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sql** | **String**| The PostgreSQL query as percent-encoded string. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

