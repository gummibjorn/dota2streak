# RequestApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestJobIdGet**](RequestApi.md#requestJobIdGet) | **GET** /request/{jobId} | GET /request/{jobId}
[**requestMatchIdPost**](RequestApi.md#requestMatchIdPost) | **POST** /request/{match_id} | POST /request/{match_id}


<a name="requestJobIdGet"></a>
# **requestJobIdGet**
> Object requestJobIdGet(jobId)

GET /request/{jobId}

Get parse request state

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestApi;


RequestApi apiInstance = new RequestApi();
String jobId = "jobId_example"; // String | The job ID to query.
try {
    Object result = apiInstance.requestJobIdGet(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestApi#requestJobIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The job ID to query. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestMatchIdPost"></a>
# **requestMatchIdPost**
> Object requestMatchIdPost(matchId)

POST /request/{match_id}

Submit a new parse request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestApi;


RequestApi apiInstance = new RequestApi();
Integer matchId = 56; // Integer | 
try {
    Object result = apiInstance.requestMatchIdPost(matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestApi#requestMatchIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

