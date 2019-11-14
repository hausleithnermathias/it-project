
# HeaderValidationEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**faultCode** | [**FaultCodeEnum**](#FaultCodeEnum) |  |  [optional]
**faultLevel** | [**FaultLevelEnum**](#FaultLevelEnum) |  |  [optional]
**message** | **String** |  |  [optional]
**data** | **String** | This is a string encoded dictionary holding Key/Value pairs or an empty string |  [optional]


<a name="FaultCodeEnum"></a>
## Enum: FaultCodeEnum
Name | Value
---- | -----
HEADER_NOT_PRESENT | &quot;HEADER_NOT_PRESENT&quot;
HEADER_MISSING_ITEM | &quot;HEADER_MISSING_ITEM&quot;
MACHINE_TOO_SMALL_FOR_GCODE | &quot;MACHINE_TOO_SMALL_FOR_GCODE&quot;
NOZZLE_AMOUNT_MISMATCH | &quot;NOZZLE_AMOUNT_MISMATCH&quot;
NOZZLE_MISMATCH | &quot;NOZZLE_MISMATCH&quot;
MATERIAL_NOT_LOADED | &quot;MATERIAL_NOT_LOADED&quot;


<a name="FaultLevelEnum"></a>
## Enum: FaultLevelEnum
Name | Value
---- | -----
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;



