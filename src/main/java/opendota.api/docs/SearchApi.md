# SearchApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchGet**](SearchApi.md#searchGet) | **GET** /search | GET /search


<a name="searchGet"></a>
# **searchGet**
> List&lt;InlineResponse20018&gt; searchGet(q)

GET /search

Search players by personaname.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String q = "q_example"; // String | Search string
try {
    List<InlineResponse20018> result = apiInstance.searchGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Search string |

### Return type

[**List&lt;InlineResponse20018&gt;**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

