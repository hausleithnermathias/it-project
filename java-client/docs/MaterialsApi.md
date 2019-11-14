# MaterialsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**materialsGet**](MaterialsApi.md#materialsGet) | **GET** /materials | 
[**materialsMaterialGuidDelete**](MaterialsApi.md#materialsMaterialGuidDelete) | **DELETE** /materials/{material_guid}/ | 
[**materialsMaterialGuidGet**](MaterialsApi.md#materialsMaterialGuidGet) | **GET** /materials/{material_guid}/ | 
[**materialsMaterialGuidPut**](MaterialsApi.md#materialsMaterialGuidPut) | **PUT** /materials/{material_guid}/ | 
[**materialsPost**](MaterialsApi.md#materialsPost) | **POST** /materials | 


<a name="materialsGet"></a>
# **materialsGet**
> List&lt;String&gt; materialsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MaterialsApi;


MaterialsApi apiInstance = new MaterialsApi();
try {
    List<String> result = apiInstance.materialsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterialsApi#materialsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="materialsMaterialGuidDelete"></a>
# **materialsMaterialGuidDelete**
> materialsMaterialGuidDelete(materialGuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MaterialsApi;


MaterialsApi apiInstance = new MaterialsApi();
String materialGuid = "materialGuid_example"; // String | GUID of material to delete
try {
    apiInstance.materialsMaterialGuidDelete(materialGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterialsApi#materialsMaterialGuidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materialGuid** | **String**| GUID of material to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="materialsMaterialGuidGet"></a>
# **materialsMaterialGuidGet**
> String materialsMaterialGuidGet(materialGuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MaterialsApi;


MaterialsApi apiInstance = new MaterialsApi();
String materialGuid = "materialGuid_example"; // String | GUID of material to fetch
try {
    String result = apiInstance.materialsMaterialGuidGet(materialGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterialsApi#materialsMaterialGuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materialGuid** | **String**| GUID of material to fetch |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="materialsMaterialGuidPut"></a>
# **materialsMaterialGuidPut**
> materialsMaterialGuidPut(materialGuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MaterialsApi;


MaterialsApi apiInstance = new MaterialsApi();
String materialGuid = "materialGuid_example"; // String | GUID of material to update
try {
    apiInstance.materialsMaterialGuidPut(materialGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterialsApi#materialsMaterialGuidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materialGuid** | **String**| GUID of material to update |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="materialsPost"></a>
# **materialsPost**
> materialsPost(file, filename, signatureFile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MaterialsApi;


MaterialsApi apiInstance = new MaterialsApi();
File file = new File("/path/to/file.txt"); // File | Material file (.xml)
String filename = "filename_example"; // String | Name of the file
File signatureFile = new File("/path/to/file.txt"); // File | Signature file (.sig)
try {
    apiInstance.materialsPost(file, filename, signatureFile);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterialsApi#materialsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Material file (.xml) |
 **filename** | **String**| Name of the file |
 **signatureFile** | **File**| Signature file (.sig) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

