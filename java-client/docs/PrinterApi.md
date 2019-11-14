# PrinterApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**printerBedGet**](PrinterApi.md#printerBedGet) | **GET** /printer/bed | 
[**printerBedPreHeatGet**](PrinterApi.md#printerBedPreHeatGet) | **GET** /printer/bed/pre_heat | 
[**printerBedPreHeatPut**](PrinterApi.md#printerBedPreHeatPut) | **PUT** /printer/bed/pre_heat | 
[**printerBedTemperatureGet**](PrinterApi.md#printerBedTemperatureGet) | **GET** /printer/bed/temperature | 
[**printerBedTemperaturePut**](PrinterApi.md#printerBedTemperaturePut) | **PUT** /printer/bed/temperature | 
[**printerBedTypeGet**](PrinterApi.md#printerBedTypeGet) | **GET** /printer/bed/type | 
[**printerDiagnosticsCapSensorNoiseGet**](PrinterApi.md#printerDiagnosticsCapSensorNoiseGet) | **GET** /printer/diagnostics/cap_sensor_noise | 
[**printerDiagnosticsCapSensorNoiseLoopCountGet**](PrinterApi.md#printerDiagnosticsCapSensorNoiseLoopCountGet) | **GET** /printer/diagnostics/cap_sensor_noise/{loop_count} | 
[**printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet**](PrinterApi.md#printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet) | **GET** /printer/diagnostics/cap_sensor_noise/{loop_count}/{sample_count} | 
[**printerDiagnosticsTemperatureFlowSampleCountGet**](PrinterApi.md#printerDiagnosticsTemperatureFlowSampleCountGet) | **GET** /printer/diagnostics/temperature_flow/{sample_count} | 
[**printerGet**](PrinterApi.md#printerGet) | **GET** /printer | 
[**printerHeadsGet**](PrinterApi.md#printerHeadsGet) | **GET** /printer/heads | 
[**printerHeadsHeadIdAccelerationGet**](PrinterApi.md#printerHeadsHeadIdAccelerationGet) | **GET** /printer/heads/{head_id}/acceleration | 
[**printerHeadsHeadIdAccelerationPut**](PrinterApi.md#printerHeadsHeadIdAccelerationPut) | **PUT** /printer/heads/{head_id}/acceleration | 
[**printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/active_material/GUID | 
[**printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/active_material | 
[**printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/active_material/guid | 
[**printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/active_material/length_remaining | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/acceleration | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut) | **PUT** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/acceleration | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/feeder | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/jerk | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut) | **PUT** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/jerk | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/max_speed | 
[**printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut) | **PUT** /printer/heads/{head_id}/extruders/{extruder_id}/feeder/max_speed | 
[**printerHeadsHeadIdExtrudersExtruderIdGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id} | 
[**printerHeadsHeadIdExtrudersExtruderIdHotendGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdHotendGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/hotend | 
[**printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/hotend/offset | 
[**printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet) | **GET** /printer/heads/{head_id}/extruders/{extruder_id}/hotend/temperature | 
[**printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut**](PrinterApi.md#printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut) | **PUT** /printer/heads/{head_id}/extruders/{extruder_id}/hotend/temperature | 
[**printerHeadsHeadIdExtrudersGet**](PrinterApi.md#printerHeadsHeadIdExtrudersGet) | **GET** /printer/heads/{head_id}/extruders/ | 
[**printerHeadsHeadIdGet**](PrinterApi.md#printerHeadsHeadIdGet) | **GET** /printer/heads/{head_id} | 
[**printerHeadsHeadIdJerkGet**](PrinterApi.md#printerHeadsHeadIdJerkGet) | **GET** /printer/heads/{head_id}/jerk | 
[**printerHeadsHeadIdJerkPut**](PrinterApi.md#printerHeadsHeadIdJerkPut) | **PUT** /printer/heads/{head_id}/jerk | 
[**printerHeadsHeadIdMaxSpeedGet**](PrinterApi.md#printerHeadsHeadIdMaxSpeedGet) | **GET** /printer/heads/{head_id}/max_speed | 
[**printerHeadsHeadIdMaxSpeedPut**](PrinterApi.md#printerHeadsHeadIdMaxSpeedPut) | **PUT** /printer/heads/{head_id}/max_speed | 
[**printerHeadsHeadIdPositionGet**](PrinterApi.md#printerHeadsHeadIdPositionGet) | **GET** /printer/heads/{head_id}/position | 
[**printerHeadsHeadIdPositionPut**](PrinterApi.md#printerHeadsHeadIdPositionPut) | **PUT** /printer/heads/{head_id}/position | 
[**printerLedBlinkPost**](PrinterApi.md#printerLedBlinkPost) | **POST** /printer/led/blink | 
[**printerLedGet**](PrinterApi.md#printerLedGet) | **GET** /printer/led | 
[**printerLedPut**](PrinterApi.md#printerLedPut) | **PUT** /printer/led | 
[**printerStatusGet**](PrinterApi.md#printerStatusGet) | **GET** /printer/status | 
[**printerValidateHeaderPost**](PrinterApi.md#printerValidateHeaderPost) | **POST** /printer/validate_header | 


<a name="printerBedGet"></a>
# **printerBedGet**
> Bed printerBedGet()



Returns bed object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    Bed result = apiInstance.printerBedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Bed**](Bed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerBedPreHeatGet"></a>
# **printerBedPreHeatGet**
> InlineResponse2003 printerBedPreHeatGet()



Returns status of pre-heating the heated bed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    InlineResponse2003 result = apiInstance.printerBedPreHeatGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedPreHeatGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerBedPreHeatPut"></a>
# **printerBedPreHeatPut**
> printerBedPreHeatPut(temperature, timeout)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
BigDecimal temperature = new BigDecimal(); // BigDecimal | Target temperature of bed in degrees Celsius
BigDecimal timeout = new BigDecimal(); // BigDecimal | Timeout for preheating in seconds
try {
    apiInstance.printerBedPreHeatPut(temperature, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedPreHeatPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **temperature** | **BigDecimal**| Target temperature of bed in degrees Celsius |
 **timeout** | **BigDecimal**| Timeout for preheating in seconds | [optional] [default to 300]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerBedTemperatureGet"></a>
# **printerBedTemperatureGet**
> CurrentTargetNumberPair printerBedTemperatureGet()



Returns temperature of bed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    CurrentTargetNumberPair result = apiInstance.printerBedTemperatureGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedTemperatureGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentTargetNumberPair**](CurrentTargetNumberPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerBedTemperaturePut"></a>
# **printerBedTemperaturePut**
> printerBedTemperaturePut(temperature)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
BigDecimal temperature = new BigDecimal(); // BigDecimal | Target temperature of bed
try {
    apiInstance.printerBedTemperaturePut(temperature);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedTemperaturePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **temperature** | **BigDecimal**| Target temperature of bed |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerBedTypeGet"></a>
# **printerBedTypeGet**
> String printerBedTypeGet()



Returns the type of the bed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    String result = apiInstance.printerBedTypeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerBedTypeGet");
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

<a name="printerDiagnosticsCapSensorNoiseGet"></a>
# **printerDiagnosticsCapSensorNoiseGet**
> printerDiagnosticsCapSensorNoiseGet()



Calculates noise variances on the cap sensor by executing taking 100 values, each  loop measuring 50 samples

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    apiInstance.printerDiagnosticsCapSensorNoiseGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerDiagnosticsCapSensorNoiseGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerDiagnosticsCapSensorNoiseLoopCountGet"></a>
# **printerDiagnosticsCapSensorNoiseLoopCountGet**
> printerDiagnosticsCapSensorNoiseLoopCountGet(loopCount)



Calculates noise variances on the cap sensor by executing the specified loop_count iterations, each iteration measuring 50 samples

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Integer loopCount = 56; // Integer | The number of times to get sample data
try {
    apiInstance.printerDiagnosticsCapSensorNoiseLoopCountGet(loopCount);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerDiagnosticsCapSensorNoiseLoopCountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loopCount** | **Integer**| The number of times to get sample data |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet"></a>
# **printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet**
> printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet(loopCount, sampleCount)



Calculates noise variances on the cap sensor by executing the specified loop_count iterations, each iteration measuring sample_count samples

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Integer loopCount = 56; // Integer | The number of times to get sample data
Integer sampleCount = 56; // Integer | The number of times to get sample data
try {
    apiInstance.printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet(loopCount, sampleCount);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerDiagnosticsCapSensorNoiseLoopCountSampleCountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loopCount** | **Integer**| The number of times to get sample data |
 **sampleCount** | **Integer**| The number of times to get sample data |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerDiagnosticsTemperatureFlowSampleCountGet"></a>
# **printerDiagnosticsTemperatureFlowSampleCountGet**
> printerDiagnosticsTemperatureFlowSampleCountGet(sampleCount, csv)



Gets historical temperature&amp;flow data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Integer sampleCount = 56; // Integer | The amount of samples to get
Integer csv = 56; // Integer | If not zero, return the results as comma separated values instead of a normal json response.
try {
    apiInstance.printerDiagnosticsTemperatureFlowSampleCountGet(sampleCount, csv);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerDiagnosticsTemperatureFlowSampleCountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sampleCount** | **Integer**| The amount of samples to get |
 **csv** | **Integer**| If not zero, return the results as comma separated values instead of a normal json response. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv

<a name="printerGet"></a>
# **printerGet**
> Printer printerGet()



Returns printer object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    Printer result = apiInstance.printerGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Printer**](Printer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsGet"></a>
# **printerHeadsGet**
> List&lt;Head&gt; printerHeadsGet()



Returns all heads of the printer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    List<Head> result = apiInstance.printerHeadsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Head&gt;**](Head.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdAccelerationGet"></a>
# **printerHeadsHeadIdAccelerationGet**
> BigDecimal printerHeadsHeadIdAccelerationGet(headId)



Returns the default acceleration of head by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head of which to get the default acceleration of. Note that this speed also has a Z component. This API assumes that the head is the only part that moves.
try {
    BigDecimal result = apiInstance.printerHeadsHeadIdAccelerationGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdAccelerationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head of which to get the default acceleration of. Note that this speed also has a Z component. This API assumes that the head is the only part that moves. |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdAccelerationPut"></a>
# **printerHeadsHeadIdAccelerationPut**
> printerHeadsHeadIdAccelerationPut(headId, acceleration)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | 
BigDecimal acceleration = new BigDecimal(); // BigDecimal | Target default acceleration.
try {
    apiInstance.printerHeadsHeadIdAccelerationPut(headId, acceleration);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdAccelerationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**|  |
 **acceleration** | **BigDecimal**| Target default acceleration. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet**
> String printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet(headId, extruderId)



Returns the GUID of the active material

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
try {
    String result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGUIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet**
> Material printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet(headId, extruderId)



Get the active material of the extruder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder
try {
    Material result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder |

### Return type

[**Material**](Material.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet**
> String printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet(headId, extruderId)



Returns the GUID of the active material

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
try {
    String result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialGuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet**
> BigDecimal printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet(headId, extruderId)



length of material remaining on spool in mm. Or -1 if no value is known.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
try {
    BigDecimal result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdActiveMaterialLengthRemainingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet**
> BigDecimal printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet(headId, extruderId)



Returns acceleration of feeder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
try {
    BigDecimal result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut**
> printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut(headId, extruderId, acceleration)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
BigDecimal acceleration = new BigDecimal(); // BigDecimal | Target acceleration speed
try {
    apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut(headId, extruderId, acceleration);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederAccelerationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |
 **acceleration** | **BigDecimal**| Target acceleration speed |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederGet**
> Feeder printerHeadsHeadIdExtrudersExtruderIdFeederGet(headId, extruderId)



Returns feeder of selected extruder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
try {
    Feeder result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |

### Return type

[**Feeder**](Feeder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet**
> BigDecimal printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet(headId, extruderId)



Returns jerk of feeder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
try {
    BigDecimal result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederJerkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut**
> printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut(headId, extruderId, jerk)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
BigDecimal jerk = new BigDecimal(); // BigDecimal | Target jerk
try {
    apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut(headId, extruderId, jerk);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederJerkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |
 **jerk** | **BigDecimal**| Target jerk |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet**
> BigDecimal printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet(headId, extruderId)



Returns max_speed of feeder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
try {
    BigDecimal result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut"></a>
# **printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut**
> printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut(headId, extruderId, maxSpeed)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder from which the feeder is fetched
BigDecimal maxSpeed = new BigDecimal(); // BigDecimal | Target max speed
try {
    apiInstance.printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut(headId, extruderId, maxSpeed);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdFeederMaxSpeedPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder from which the feeder is fetched |
 **maxSpeed** | **BigDecimal**| Target max speed |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdGet**
> Extruder printerHeadsHeadIdExtrudersExtruderIdGet(headId, extruderId)



Returns extruder by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder to fetch.
try {
    Extruder result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder to fetch. |

### Return type

[**Extruder**](Extruder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdHotendGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdHotendGet**
> Hotend printerHeadsHeadIdExtrudersExtruderIdHotendGet(headId, extruderId)



Returns hotend of extruder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
try {
    Hotend result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdHotendGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdHotendGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |

### Return type

[**Hotend**](Hotend.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet**
> HotendOffset printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet(headId, extruderId)



Returns offset of hotend with respect to head

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruder is fetched
Long extruderId = 789L; // Long | ID of extruder to fetch
try {
    HotendOffset result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdHotendOffsetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruder is fetched |
 **extruderId** | **Long**| ID of extruder to fetch |

### Return type

[**HotendOffset**](HotendOffset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet"></a>
# **printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet**
> CurrentTargetNumberPair printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet(headId, extruderId)



Returns temperature of extruder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
try {
    CurrentTargetNumberPair result = apiInstance.printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet(headId, extruderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdHotendTemperatureGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |

### Return type

[**CurrentTargetNumberPair**](CurrentTargetNumberPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut"></a>
# **printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut**
> printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut(headId, extruderId, temperature)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
Long extruderId = 789L; // Long | ID of extruder from which the hotend is fetched
BigDecimal temperature = new BigDecimal(); // BigDecimal | Target temperature of nozzle
try {
    apiInstance.printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut(headId, extruderId, temperature);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersExtruderIdHotendTemperaturePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **extruderId** | **Long**| ID of extruder from which the hotend is fetched |
 **temperature** | **BigDecimal**| Target temperature of nozzle |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdExtrudersGet"></a>
# **printerHeadsHeadIdExtrudersGet**
> List&lt;Extruder&gt; printerHeadsHeadIdExtrudersGet(headId)



Returns all extruders of a head

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the extruders are fetched
try {
    List<Extruder> result = apiInstance.printerHeadsHeadIdExtrudersGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdExtrudersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the extruders are fetched |

### Return type

[**List&lt;Extruder&gt;**](Extruder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdGet"></a>
# **printerHeadsHeadIdGet**
> Head printerHeadsHeadIdGet(headId)



Returns head by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head to fetch
try {
    Head result = apiInstance.printerHeadsHeadIdGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head to fetch |

### Return type

[**Head**](Head.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdJerkGet"></a>
# **printerHeadsHeadIdJerkGet**
> XYZ printerHeadsHeadIdJerkGet(headId)



Returns jerk of head by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head of which to get the jerk of. Note that this speed also has a Z component. This API assumes that the head is the only part that moves.
try {
    XYZ result = apiInstance.printerHeadsHeadIdJerkGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdJerkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head of which to get the jerk of. Note that this speed also has a Z component. This API assumes that the head is the only part that moves. |

### Return type

[**XYZ**](XYZ.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdJerkPut"></a>
# **printerHeadsHeadIdJerkPut**
> printerHeadsHeadIdJerkPut(headId, jerk)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | 
XYZ jerk = new XYZ(); // XYZ | Target jerk
try {
    apiInstance.printerHeadsHeadIdJerkPut(headId, jerk);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdJerkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**|  |
 **jerk** | [**XYZ**](XYZ.md)| Target jerk |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdMaxSpeedGet"></a>
# **printerHeadsHeadIdMaxSpeedGet**
> XYZ printerHeadsHeadIdMaxSpeedGet(headId)



Returns max speed of head by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head of which to get the max speed of. Note that this speed also has a Z component. This api assumes that the head is the only part that moves.
try {
    XYZ result = apiInstance.printerHeadsHeadIdMaxSpeedGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdMaxSpeedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head of which to get the max speed of. Note that this speed also has a Z component. This api assumes that the head is the only part that moves. |

### Return type

[**XYZ**](XYZ.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdMaxSpeedPut"></a>
# **printerHeadsHeadIdMaxSpeedPut**
> printerHeadsHeadIdMaxSpeedPut(headId, speed)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | 
XYZ speed = new XYZ(); // XYZ | Target max_speed
try {
    apiInstance.printerHeadsHeadIdMaxSpeedPut(headId, speed);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdMaxSpeedPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**|  |
 **speed** | [**XYZ**](XYZ.md)| Target max_speed |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdPositionGet"></a>
# **printerHeadsHeadIdPositionGet**
> XYZ printerHeadsHeadIdPositionGet(headId)



Returns position of head by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head of which to get position. Note that this position also has a Z component. This api assumes that the head is the only part that moves.
try {
    XYZ result = apiInstance.printerHeadsHeadIdPositionGet(headId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdPositionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head of which to get position. Note that this position also has a Z component. This api assumes that the head is the only part that moves. |

### Return type

[**XYZ**](XYZ.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerHeadsHeadIdPositionPut"></a>
# **printerHeadsHeadIdPositionPut**
> printerHeadsHeadIdPositionPut(headId, position)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Long headId = 789L; // Long | ID of head from which the hotend is fetched
XYZ position = new XYZ(); // XYZ | Target position
try {
    apiInstance.printerHeadsHeadIdPositionPut(headId, position);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerHeadsHeadIdPositionPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headId** | **Long**| ID of head from which the hotend is fetched |
 **position** | [**XYZ**](XYZ.md)| Target position |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerLedBlinkPost"></a>
# **printerLedBlinkPost**
> printerLedBlinkPost(blink)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Blink blink = new Blink(); // Blink | 
try {
    apiInstance.printerLedBlinkPost(blink);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerLedBlinkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blink** | [**Blink**](Blink.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerLedGet"></a>
# **printerLedGet**
> Led printerLedGet()



Returns hue, saturation, and value (HSV) of the case lighting

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    Led result = apiInstance.printerLedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerLedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Led**](Led.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerLedPut"></a>
# **printerLedPut**
> printerLedPut(color)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
Led color = new Led(); // Led | Target hue of case lighting
try {
    apiInstance.printerLedPut(color);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerLedPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **color** | [**Led**](Led.md)| Target hue of case lighting |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerStatusGet"></a>
# **printerStatusGet**
> String printerStatusGet()



Get the status of the printer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
try {
    String result = apiInstance.printerStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerStatusGet");
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

<a name="printerValidateHeaderPost"></a>
# **printerValidateHeaderPost**
> List&lt;HeaderValidationEntry&gt; printerValidateHeaderPost(file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrinterApi;


PrinterApi apiInstance = new PrinterApi();
File file = new File("/path/to/file.txt"); // File | File that needs to be printed (.gcode, .gcode.gz)
try {
    List<HeaderValidationEntry> result = apiInstance.printerValidateHeaderPost(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrinterApi#printerValidateHeaderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File that needs to be printed (.gcode, .gcode.gz) |

### Return type

[**List&lt;HeaderValidationEntry&gt;**](HeaderValidationEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

