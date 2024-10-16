package stdgui.data.model.orimodel;

@XmlType(name="ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum AsynchronousServerCallPointSubtypesEnum {

@XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
ASYNCHRONOUS_SERVER_CALL_POINT("ASYNCHRONOUS-SERVER-CALL-POINT");


    private final java.lang.String value;

    AsynchronousServerCallPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AsynchronousServerCallPointSubtypesEnum fromValue(java.lang.String v) {
        for (AsynchronousServerCallPointSubtypesEnum c: AsynchronousServerCallPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}