# ScenariosApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scenariosItemTimingsGet**](ScenariosApi.md#scenariosItemTimingsGet) | **GET** /scenarios/itemTimings | GET /scenarios/itemTimings
[**scenariosLaneRolesGet**](ScenariosApi.md#scenariosLaneRolesGet) | **GET** /scenarios/laneRoles | GET /scenarios/laneRoles
[**scenariosMiscGet**](ScenariosApi.md#scenariosMiscGet) | **GET** /scenarios/misc | GET /scenarios/misc


<a name="scenariosItemTimingsGet"></a>
# **scenariosItemTimingsGet**
> List&lt;InlineResponse20031&gt; scenariosItemTimingsGet(item, heroId)

GET /scenarios/itemTimings

Win rates for certain item timings on a hero for items that cost at least 1400 gold

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScenariosApi;


ScenariosApi apiInstance = new ScenariosApi();
String item = "item_example"; // String | Filter by item name e.g. \"spirit_vessel\"
Integer heroId = 56; // Integer | Hero ID
try {
    List<InlineResponse20031> result = apiInstance.scenariosItemTimingsGet(item, heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenariosApi#scenariosItemTimingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **String**| Filter by item name e.g. \&quot;spirit_vessel\&quot; | [optional]
 **heroId** | **Integer**| Hero ID | [optional]

### Return type

[**List&lt;InlineResponse20031&gt;**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scenariosLaneRolesGet"></a>
# **scenariosLaneRolesGet**
> List&lt;InlineResponse20032&gt; scenariosLaneRolesGet(laneRole, heroId)

GET /scenarios/laneRoles

Win rates for heroes in certain lane roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScenariosApi;


ScenariosApi apiInstance = new ScenariosApi();
String laneRole = "laneRole_example"; // String | Filter by lane role 1-4 (Safe, Mid, Off, Jungle)
Integer heroId = 56; // Integer | Hero ID
try {
    List<InlineResponse20032> result = apiInstance.scenariosLaneRolesGet(laneRole, heroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenariosApi#scenariosLaneRolesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **laneRole** | **String**| Filter by lane role 1-4 (Safe, Mid, Off, Jungle) | [optional]
 **heroId** | **Integer**| Hero ID | [optional]

### Return type

[**List&lt;InlineResponse20032&gt;**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scenariosMiscGet"></a>
# **scenariosMiscGet**
> List&lt;InlineResponse20033&gt; scenariosMiscGet(scenario)

GET /scenarios/misc

Miscellaneous team scenarios

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScenariosApi;


ScenariosApi apiInstance = new ScenariosApi();
String scenario = "scenario_example"; // String | pos_chat_1min,neg_chat_1min,courier_kill,first_blood
try {
    List<InlineResponse20033> result = apiInstance.scenariosMiscGet(scenario);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenariosApi#scenariosMiscGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenario** | **String**| pos_chat_1min,neg_chat_1min,courier_kill,first_blood | [optional]

### Return type

[**List&lt;InlineResponse20033&gt;**](InlineResponse20033.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

