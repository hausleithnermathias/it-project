# NetworkApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**printerNetworkGet**](NetworkApi.md#printerNetworkGet) | **GET** /printer/network | 
[**printerNetworkSSIDGet**](NetworkApi.md#printerNetworkSSIDGet) | **GET** /printer/network/SSID | 
[**printerNetworkWifiNetworksGet**](NetworkApi.md#printerNetworkWifiNetworksGet) | **GET** /printer/network/wifi_networks | 
[**printerNetworkWifiNetworksSsidDelete**](NetworkApi.md#printerNetworkWifiNetworksSsidDelete) | **DELETE** /printer/network/wifi_networks/{ssid} | 
[**printerNetworkWifiNetworksSsidPut**](NetworkApi.md#printerNetworkWifiNetworksSsidPut) | **PUT** /printer/network/wifi_networks/{ssid} | 


<a name="printerNetworkGet"></a>
# **printerNetworkGet**
> Network printerNetworkGet()



Returns connection type of network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
try {
    Network result = apiInstance.printerNetworkGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#printerNetworkGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Network**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerNetworkSSIDGet"></a>
# **printerNetworkSSIDGet**
> String printerNetworkSSIDGet()



Returns the SSID of the network (if any)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
try {
    String result = apiInstance.printerNetworkSSIDGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#printerNetworkSSIDGet");
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

<a name="printerNetworkWifiNetworksGet"></a>
# **printerNetworkWifiNetworksGet**
> List&lt;WifiNetwork&gt; printerNetworkWifiNetworksGet()



Returns connection type of network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
try {
    List<WifiNetwork> result = apiInstance.printerNetworkWifiNetworksGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#printerNetworkWifiNetworksGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WifiNetwork&gt;**](WifiNetwork.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerNetworkWifiNetworksSsidDelete"></a>
# **printerNetworkWifiNetworksSsidDelete**
> printerNetworkWifiNetworksSsidDelete(ssid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
String ssid = "ssid_example"; // String | ssid of the network to forget.
try {
    apiInstance.printerNetworkWifiNetworksSsidDelete(ssid);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#printerNetworkWifiNetworksSsidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssid** | **String**| ssid of the network to forget. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printerNetworkWifiNetworksSsidPut"></a>
# **printerNetworkWifiNetworksSsidPut**
> printerNetworkWifiNetworksSsidPut(ssid, passphrase)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
String ssid = "ssid_example"; // String | ssid of the network to connect with.
String passphrase = "passphrase_example"; // String | Phassphrase of network to connect with
try {
    apiInstance.printerNetworkWifiNetworksSsidPut(ssid, passphrase);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#printerNetworkWifiNetworksSsidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssid** | **String**| ssid of the network to connect with. |
 **passphrase** | **String**| Phassphrase of network to connect with |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

