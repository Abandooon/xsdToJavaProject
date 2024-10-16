package stdgui.data.model.orimodel;

@XmlType(name="BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum BswAsynchronousServerCallResultPointSubtypesEnum {

@XmlEnumValue("BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
BSW_ASYNCHRONOUS_SERVER_CALL_RESULT_POINT("BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT");


    private final java.lang.String value;

    BswAsynchronousServerCallResultPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswAsynchronousServerCallResultPointSubtypesEnum fromValue(java.lang.String v) {
        for (BswAsynchronousServerCallResultPointSubtypesEnum c: BswAsynchronousServerCallResultPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}