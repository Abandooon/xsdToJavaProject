package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-OPERATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventOperationTypeEnumSimple {

@XmlEnumValue("OPERATION-CALL-RECEIVED")
OPERATION_CALL_RECEIVED("OPERATION-CALL-RECEIVED"),

@XmlEnumValue("OPERATION-CALL-RESPONSE-RECEIVED")
OPERATION_CALL_RESPONSE_RECEIVED("OPERATION-CALL-RESPONSE-RECEIVED"),

@XmlEnumValue("OPERATION-CALL-RESPONSE-SENT")
OPERATION_CALL_RESPONSE_SENT("OPERATION-CALL-RESPONSE-SENT"),

@XmlEnumValue("OPERATION-CALLED")
OPERATION_CALLED("OPERATION-CALLED");


    private final java.lang.String value;

    TdEventOperationTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventOperationTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventOperationTypeEnumSimple c: TdEventOperationTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}