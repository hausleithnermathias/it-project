# HistoryApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**historyEventsGet**](HistoryApi.md#historyEventsGet) | **GET** /history/events | 
[**historyEventsPost**](HistoryApi.md#historyEventsPost) | **POST** /history/events | 
[**historyPrintJobsGet**](HistoryApi.md#historyPrintJobsGet) | **GET** /history/print_jobs | 
[**historyPrintJobsUuidGet**](HistoryApi.md#historyPrintJobsUuidGet) | **GET** /history/print_jobs/{uuid} | 


<a name="historyEventsGet"></a>
# **historyEventsGet**
> List&lt;EventHistoryEntry&gt; historyEventsGet(offset, count, typeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
BigDecimal offset = new BigDecimal(); // BigDecimal | Allow an offset parameter to specify the start in the history to get events from. Defaults to 0
BigDecimal count = new BigDecimal(); // BigDecimal | Allow a count parameter to specify the number of events to get from the log. Defaults to 50
BigDecimal typeId = new BigDecimal(); // BigDecimal | Allows the user to filter events by type
try {
    List<EventHistoryEntry> result = apiInstance.historyEventsGet(offset, count, typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#historyEventsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **BigDecimal**| Allow an offset parameter to specify the start in the history to get events from. Defaults to 0 | [optional]
 **count** | **BigDecimal**| Allow a count parameter to specify the number of events to get from the log. Defaults to 50 | [optional]
 **typeId** | **BigDecimal**| Allows the user to filter events by type | [optional]

### Return type

[**List&lt;EventHistoryEntry&gt;**](EventHistoryEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="historyEventsPost"></a>
# **historyEventsPost**
> historyEventsPost(typeId, parameters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
BigDecimal typeId = new BigDecimal(); // BigDecimal | 
List<String> parameters = Arrays.asList("parameters_example"); // List<String> | 
try {
    apiInstance.historyEventsPost(typeId, parameters);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#historyEventsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | **BigDecimal**|  |
 **parameters** | [**List&lt;String&gt;**](String.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="historyPrintJobsGet"></a>
# **historyPrintJobsGet**
> List&lt;PrintJobHistory&gt; historyPrintJobsGet(offset, count)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
BigDecimal offset = new BigDecimal(); // BigDecimal | Allow an offset parameter to specify the start in the history to get jobs from. Defaults to 0
BigDecimal count = new BigDecimal(); // BigDecimal | Allow a count parameter to specify the number of jobs to get from the log. Defaults to 50
try {
    List<PrintJobHistory> result = apiInstance.historyPrintJobsGet(offset, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#historyPrintJobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **BigDecimal**| Allow an offset parameter to specify the start in the history to get jobs from. Defaults to 0 | [optional]
 **count** | **BigDecimal**| Allow a count parameter to specify the number of jobs to get from the log. Defaults to 50 | [optional]

### Return type

[**List&lt;PrintJobHistory&gt;**](PrintJobHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="historyPrintJobsUuidGet"></a>
# **historyPrintJobsUuidGet**
> PrintJobHistory historyPrintJobsUuidGet(uuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
String uuid = "uuid_example"; // String | UUID of the job to get
try {
    PrintJobHistory result = apiInstance.historyPrintJobsUuidGet(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#historyPrintJobsUuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| UUID of the job to get |

### Return type

[**PrintJobHistory**](PrintJobHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

