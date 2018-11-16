# LeaguesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaguesGet**](LeaguesApi.md#leaguesGet) | **GET** /leagues | GET /leagues


<a name="leaguesGet"></a>
# **leaguesGet**
> List&lt;InlineResponse20025&gt; leaguesGet()

GET /leagues

Get league data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaguesApi;


LeaguesApi apiInstance = new LeaguesApi();
try {
    List<InlineResponse20025> result = apiInstance.leaguesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaguesApi#leaguesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20025&gt;**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

