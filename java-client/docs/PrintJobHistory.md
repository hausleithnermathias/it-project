
# PrintJobHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeElapsed** | **Integer** |  |  [optional]
**timeEstimated** | **Integer** |  |  [optional]
**timeTotal** | **Integer** |  |  [optional]
**datetimeStarted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datetimeFinished** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datetimeCleaned** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**result** | [**ResultEnum**](#ResultEnum) |  |  [optional]
**source** | **String** |  |  [optional]
**reprintOriginalUuid** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]


<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
FINISHED | &quot;Finished&quot;
ABORTED | &quot;Aborted&quot;



