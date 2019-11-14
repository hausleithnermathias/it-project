# SystemApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beepPut**](SystemApi.md#beepPut) | **PUT** /beep | 
[**systemCountryGet**](SystemApi.md#systemCountryGet) | **GET** /system/country | 
[**systemCountryPut**](SystemApi.md#systemCountryPut) | **PUT** /system/country | 
[**systemDisplayMessagePut**](SystemApi.md#systemDisplayMessagePut) | **PUT** /system/display_message | 
[**systemGet**](SystemApi.md#systemGet) | **GET** /system | 
[**systemGuidGet**](SystemApi.md#systemGuidGet) | **GET** /system/guid | 
[**systemHardwareRevisionGet**](SystemApi.md#systemHardwareRevisionGet) | **GET** /system/hardware/revision | 
[**systemHardwareTypeidGet**](SystemApi.md#systemHardwareTypeidGet) | **GET** /system/hardware/typeid | 
[**systemLanguageGet**](SystemApi.md#systemLanguageGet) | **GET** /system/language | 
[**systemLogGet**](SystemApi.md#systemLogGet) | **GET** /system/log | 
[**systemNameGet**](SystemApi.md#systemNameGet) | **GET** /system/name | 
[**systemNamePut**](SystemApi.md#systemNamePut) | **PUT** /system/name | 
[**systemTypeGet**](SystemApi.md#systemTypeGet) | **GET** /system/type | 
[**systemUptimeGet**](SystemApi.md#systemUptimeGet) | **GET** /system/uptime | 
[**systemVariantGet**](SystemApi.md#systemVariantGet) | **GET** /system/variant | 


<a name="beepPut"></a>
# **beepPut**
> beepPut(frequency, duration)



Makes the printer beep

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
BigDecimal frequency = new BigDecimal(); // BigDecimal | The frequency of the tone (in Hz)
BigDecimal duration = new BigDecimal(); // BigDecimal | The duration of the tone (in ms)
try {
    apiInstance.beepPut(frequency, duration);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#beepPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **frequency** | **BigDecimal**| The frequency of the tone (in Hz) |
 **duration** | **BigDecimal**| The duration of the tone (in ms) |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemCountryGet"></a>
# **systemCountryGet**
> String systemCountryGet()



Get the country of the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemCountryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemCountryGet");
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

<a name="systemCountryPut"></a>
# **systemCountryPut**
> systemCountryPut(country)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String country = "country_example"; // String | Target country of system
try {
    apiInstance.systemCountryPut(country);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemCountryPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Target country of system |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemDisplayMessagePut"></a>
# **systemDisplayMessagePut**
> systemDisplayMessagePut(messageData)



Enable external services to display a message screen on the printer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
MessageData messageData = new MessageData(); // MessageData | Data to display on the screen of the printer.
try {
    apiInstance.systemDisplayMessagePut(messageData);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemDisplayMessagePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageData** | [**MessageData**](MessageData.md)| Data to display on the screen of the printer. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemGet"></a>
# **systemGet**
> System systemGet()



Get the entire system object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    System result = apiInstance.systemGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**System**](System.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemGuidGet"></a>
# **systemGuidGet**
> String systemGuidGet()



Every machine as a unique identifier stored inside the board. This allows for unique identification of this machine. This identifier is a UUID4.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemGuidGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGuidGet");
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

<a name="systemHardwareRevisionGet"></a>
# **systemHardwareRevisionGet**
> Integer systemHardwareRevisionGet()



The same machine could have different hardware revisions. When hardware is updated and software needs to know that hardware has changed, this revision number is changed. Currently only revision 0 is known.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Integer result = apiInstance.systemHardwareRevisionGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemHardwareRevisionGet");
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

<a name="systemHardwareTypeidGet"></a>
# **systemHardwareTypeidGet**
> Integer systemHardwareTypeidGet()



Gets the machine type as number identifier. This identifier IDs a specific form of hardware

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Integer result = apiInstance.systemHardwareTypeidGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemHardwareTypeidGet");
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

<a name="systemLanguageGet"></a>
# **systemLanguageGet**
> String systemLanguageGet()



Get the language of the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemLanguageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemLanguageGet");
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

<a name="systemLogGet"></a>
# **systemLogGet**
> SystemLog systemLogGet(boot, lines)



Get the logs of the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
BigDecimal boot = new BigDecimal(); // BigDecimal | Allow a boot parameter to get logs from previous boot sessions, default is 0 which is the current boot. -1 is the previous boot.
BigDecimal lines = new BigDecimal(); // BigDecimal | Allow a lines parameter to specify the number of lines to get from the log. Defaults to 50
try {
    SystemLog result = apiInstance.systemLogGet(boot, lines);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boot** | **BigDecimal**| Allow a boot parameter to get logs from previous boot sessions, default is 0 which is the current boot. -1 is the previous boot. | [optional]
 **lines** | **BigDecimal**| Allow a lines parameter to specify the number of lines to get from the log. Defaults to 50 | [optional]

### Return type

[**SystemLog**](SystemLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemNameGet"></a>
# **systemNameGet**
> String systemNameGet()



Get the name of the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemNameGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemNameGet");
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

<a name="systemNamePut"></a>
# **systemNamePut**
> systemNamePut(name)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String name = "name_example"; // String | Target name of machine
try {
    apiInstance.systemNamePut(name);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Target name of machine |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemTypeGet"></a>
# **systemTypeGet**
> String systemTypeGet()



Get the type of machine that we are talking with. Always returns \&quot;3D printer\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemTypeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemTypeGet");
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

<a name="systemUptimeGet"></a>
# **systemUptimeGet**
> Integer systemUptimeGet()



Get the uptime of the system in seconds

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Integer result = apiInstance.systemUptimeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemUptimeGet");
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

<a name="systemVariantGet"></a>
# **systemVariantGet**
> String systemVariantGet()



Gets the machines variant. Currently this can return \&quot;Ultimaker 3\&quot; or \&quot;Ultimaker 3 extended\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.systemVariantGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemVariantGet");
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

