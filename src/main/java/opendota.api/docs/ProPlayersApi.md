# ProPlayersApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**proPlayersGet**](ProPlayersApi.md#proPlayersGet) | **GET** /proPlayers | GET /proPlayers


<a name="proPlayersGet"></a>
# **proPlayersGet**
> List&lt;InlineResponse20013&gt; proPlayersGet()

GET /proPlayers

Get list of pro players

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProPlayersApi;


ProPlayersApi apiInstance = new ProPlayersApi();
try {
    List<InlineResponse20013> result = apiInstance.proPlayersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProPlayersApi#proPlayersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20013&gt;**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

