# ReplaysApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replaysGet**](ReplaysApi.md#replaysGet) | **GET** /replays | GET /replays


<a name="replaysGet"></a>
# **replaysGet**
> List&lt;InlineResponse20029&gt; replaysGet(matchId)

GET /replays

Get data to construct a replay URL with

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReplaysApi;


ReplaysApi apiInstance = new ReplaysApi();
Integer matchId = 56; // Integer | Match IDs (array)
try {
    List<InlineResponse20029> result = apiInstance.replaysGet(matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplaysApi#replaysGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Integer**| Match IDs (array) |

### Return type

[**List&lt;InlineResponse20029&gt;**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

