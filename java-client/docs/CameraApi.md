# CameraApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cameraFeedGet**](CameraApi.md#cameraFeedGet) | **GET** /camera/feed | 
[**cameraGet**](CameraApi.md#cameraGet) | **GET** /camera | 
[**cameraIndexSnapshotGet**](CameraApi.md#cameraIndexSnapshotGet) | **GET** /camera/{index}/snapshot | 
[**cameraIndexStreamGet**](CameraApi.md#cameraIndexStreamGet) | **GET** /camera/{index}/stream | 


<a name="cameraFeedGet"></a>
# **cameraFeedGet**
> String cameraFeedGet()



Get a link to the camera feed, this returns an url to a camera stream

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CameraApi;


CameraApi apiInstance = new CameraApi();
try {
    String result = apiInstance.cameraFeedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CameraApi#cameraFeedGet");
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

<a name="cameraGet"></a>
# **cameraGet**
> Camera cameraGet()



Returns camera object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CameraApi;


CameraApi apiInstance = new CameraApi();
try {
    Camera result = apiInstance.cameraGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CameraApi#cameraGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Camera**](Camera.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cameraIndexSnapshotGet"></a>
# **cameraIndexSnapshotGet**
> cameraIndexSnapshotGet(index)



Get a redirection to the camera snapshot.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CameraApi;


CameraApi apiInstance = new CameraApi();
BigDecimal index = new BigDecimal(); // BigDecimal | index of the camera to get the snapshot from.
try {
    apiInstance.cameraIndexSnapshotGet(index);
} catch (ApiException e) {
    System.err.println("Exception when calling CameraApi#cameraIndexSnapshotGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index** | **BigDecimal**| index of the camera to get the snapshot from. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cameraIndexStreamGet"></a>
# **cameraIndexStreamGet**
> cameraIndexStreamGet(index)



Get a redirection to the camera live feed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CameraApi;


CameraApi apiInstance = new CameraApi();
BigDecimal index = new BigDecimal(); // BigDecimal | index of the camera to get the feed from.
try {
    apiInstance.cameraIndexStreamGet(index);
} catch (ApiException e) {
    System.err.println("Exception when calling CameraApi#cameraIndexStreamGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index** | **BigDecimal**| index of the camera to get the feed from. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

