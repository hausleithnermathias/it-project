# PrintJobApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**printJobGcodeGet**](PrintJobApi.md#printJobGcodeGet) | **GET** /print_job/gcode | 
[**printJobGet**](PrintJobApi.md#printJobGet) | **GET** /print_job | 
[**printJobNameGet**](PrintJobApi.md#printJobNameGet) | **GET** /print_job/name | 
[**printJobPost**](PrintJobApi.md#printJobPost) | **POST** /print_job | 
[**printJobProgressGet**](PrintJobApi.md#printJobProgressGet) | **GET** /print_job/progress | 
[**printJobReprintOriginalUuidGet**](PrintJobApi.md#printJobReprintOriginalUuidGet) | **GET** /print_job/reprint_original_uuid | 
[**printJobSourceApplicationGet**](PrintJobApi.md#printJobSourceApplicationGet) | **GET** /print_job/source_application | 
[**printJobSourceGet**](PrintJobApi.md#printJobSourceGet) | **GET** /print_job/source | 
[**printJobSourceUserGet**](PrintJobApi.md#printJobSourceUserGet) | **GET** /print_job/source_user | 
[**printJobStateGet**](PrintJobApi.md#printJobStateGet) | **GET** /print_job/state | 
[**printJobStatePut**](PrintJobApi.md#printJobStatePut) | **PUT** /print_job/state | 
[**printJobTimeElapsedGet**](PrintJobApi.md#printJobTimeElapsedGet) | **GET** /print_job/time_elapsed | 
[**printJobTimeTotalGet**](PrintJobApi.md#printJobTimeTotalGet) | **GET** /print_job/time_total | 
[**printJobUuidGet**](PrintJobApi.md#printJobUuidGet) | **GET** /print_job/uuid | 


<a name="printJobGcodeGet"></a>
# **printJobGcodeGet**
> File printJobGcodeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    File result = apiInstance.printJobGcodeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobGcodeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobGet"></a>
# **printJobGet**
> PrintJob printJobGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    PrintJob result = apiInstance.printJobGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrintJob**](PrintJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobNameGet"></a>
# **printJobNameGet**
> String printJobNameGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobNameGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobNameGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobPost"></a>
# **printJobPost**
> InlineResponse201 printJobPost(jobname, file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
String jobname = "jobname_example"; // String | Name of the print job.
File file = new File("/path/to/file.txt"); // File | File that needs to be printed (.gcode, .gcode.gz)
try {
    InlineResponse201 result = apiInstance.printJobPost(jobname, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobname** | **String**| Name of the print job. |
 **file** | **File**| File that needs to be printed (.gcode, .gcode.gz) |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobProgressGet"></a>
# **printJobProgressGet**
> BigDecimal printJobProgressGet()



Get the (estimated) progress for the current print job, a value between 0 and 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    BigDecimal result = apiInstance.printJobProgressGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobProgressGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobReprintOriginalUuidGet"></a>
# **printJobReprintOriginalUuidGet**
> String printJobReprintOriginalUuidGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobReprintOriginalUuidGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobReprintOriginalUuidGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobSourceApplicationGet"></a>
# **printJobSourceApplicationGet**
> String printJobSourceApplicationGet()



If the origin equals to WEB_API, then this will return the application that sent the job

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobSourceApplicationGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobSourceApplicationGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobSourceGet"></a>
# **printJobSourceGet**
> String printJobSourceGet()



From what source was the print job started. USB means it&#39;s started manually from the USB drive. WEB_API means it&#39;s being received by the WEB API. CALIBRATION_MENU means it&#39;s printing the XY offset print

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobSourceGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobSourceGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobSourceUserGet"></a>
# **printJobSourceUserGet**
> String printJobSourceUserGet()



If the origin equals to WEB_API, then this will return the user who initiated the job

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobSourceUserGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobSourceUserGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobStateGet"></a>
# **printJobStateGet**
> String printJobStateGet()



Get the print job state

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobStateGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobStateGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobStatePut"></a>
# **printJobStatePut**
> printJobStatePut(target)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
String target = "target_example"; // String | \"print\", \"pause\" or \"abort\". Change the current state of the print. Note that only changes to abort / pause are always allowed and changing to print only when state is paused.
try {
    apiInstance.printJobStatePut(target);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobStatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **String**| \&quot;print\&quot;, \&quot;pause\&quot; or \&quot;abort\&quot;. Change the current state of the print. Note that only changes to abort / pause are always allowed and changing to print only when state is paused. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobTimeElapsedGet"></a>
# **printJobTimeElapsedGet**
> Integer printJobTimeElapsedGet()



Get the time elapsed (in seconds) since starting this print, including pauses etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    Integer result = apiInstance.printJobTimeElapsedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobTimeElapsedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobTimeTotalGet"></a>
# **printJobTimeTotalGet**
> Integer printJobTimeTotalGet()



Get the (estimated) total time in seconds for this print, excluding pauses etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    Integer result = apiInstance.printJobTimeTotalGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobTimeTotalGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printJobUuidGet"></a>
# **printJobUuidGet**
> String printJobUuidGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrintJobApi;


PrintJobApi apiInstance = new PrintJobApi();
try {
    String result = apiInstance.printJobUuidGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintJobApi#printJobUuidGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

