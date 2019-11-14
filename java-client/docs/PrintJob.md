
# PrintJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeElapsed** | **Integer** |  |  [optional]
**timeTotal** | **Integer** |  |  [optional]
**datetimeStarted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datetimeFinished** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datetimeCleaned** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**source** | **String** |  |  [optional]
**sourceUser** | **String** |  |  [optional]
**sourceApplication** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**reprintOriginalUuid** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
PRINTING | &quot;printing&quot;
PAUSING | &quot;pausing&quot;
PAUSED | &quot;paused&quot;
RESUMING | &quot;resuming&quot;
PRE_PRINT | &quot;pre_print&quot;
POST_PRINT | &quot;post_print&quot;
WAIT_CLEANUP | &quot;wait_cleanup&quot;



