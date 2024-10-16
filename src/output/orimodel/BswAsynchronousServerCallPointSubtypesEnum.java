package stdgui.data.model.orimodel;

@XmlType(name="BSW-ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum BswAsynchronousServerCallPointSubtypesEnum {

@XmlEnumValue("BSW-ASYNCHRONOUS-SERVER-CALL-POINT")
BSW_ASYNCHRONOUS_SERVER_CALL_POINT("BSW-ASYNCHRONOUS-SERVER-CALL-POINT");


    private final java.lang.String value;

    BswAsynchronousServerCallPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswAsynchronousServerCallPointSubtypesEnum fromValue(java.lang.String v) {
        for (BswAsynchronousServerCallPointSubtypesEnum c: BswAsynchronousServerCallPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}