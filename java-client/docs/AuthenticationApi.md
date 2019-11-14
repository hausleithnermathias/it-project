# AuthenticationApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authCheckIdGet**](AuthenticationApi.md#authCheckIdGet) | **GET** /auth/check/{id} | 
[**authRequestPost**](AuthenticationApi.md#authRequestPost) | **POST** /auth/request | 
[**authVerifyGet**](AuthenticationApi.md#authVerifyGet) | **GET** /auth/verify | 


<a name="authCheckIdGet"></a>
# **authCheckIdGet**
> InlineResponse2001 authCheckIdGet(id)



Check if the given ID is authorized for printer access. Will return &#39;authorized&#39; when the end user has selected that this application is allowed to use the printer. Will return &#39;unauthorized&#39; when the user has selected that the application is not allowed to access the printer. Will return &#39;unknown&#39; when the end user has not selected any option yet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String id = "id_example"; // String | id returned from the /auth/request call
try {
    InlineResponse2001 result = apiInstance.authCheckIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authCheckIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id returned from the /auth/request call |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authRequestPost"></a>
# **authRequestPost**
> InlineResponse200 authRequestPost(application, user, hostName, exclusionKey)



Request authentication from the printer. This generates new id/key combination that has to be used as username/password in the digest authentication on certain APIs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String application = "application_example"; // String | Name of the application that wants access. Displayed to the user.
String user = "user_example"; // String | Name of the user who wants access. Displayed to the user when confirming access.
String hostName = "hostName_example"; // String | Optionally the hostname of the service that is authenticating can be provided for future use.
String exclusionKey = "exclusionKey_example"; // String | Optionally This key can make sure only one authorisation will exist on the remote printer with this same key, This allows a new user to de-authenticate the old one preventing multiple printer controlling applications to use the printer at the same time. Naturally multiple authorisations can exist if this is omitted
try {
    InlineResponse200 result = apiInstance.authRequestPost(application, user, hostName, exclusionKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Name of the application that wants access. Displayed to the user. |
 **user** | **String**| Name of the user who wants access. Displayed to the user when confirming access. |
 **hostName** | **String**| Optionally the hostname of the service that is authenticating can be provided for future use. | [optional]
 **exclusionKey** | **String**| Optionally This key can make sure only one authorisation will exist on the remote printer with this same key, This allows a new user to de-authenticate the old one preventing multiple printer controlling applications to use the printer at the same time. Naturally multiple authorisations can exist if this is omitted | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authVerifyGet"></a>
# **authVerifyGet**
> InlineResponse2002 authVerifyGet()



This API call always does authentication checking for digest authentication. Invalid digest id/key combinations will generate a 401 result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    InlineResponse2002 result = apiInstance.authVerifyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authVerifyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

