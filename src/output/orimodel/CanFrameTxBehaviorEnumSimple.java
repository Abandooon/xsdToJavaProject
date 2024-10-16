package stdgui.data.model.orimodel;

@XmlType(name="CAN-FRAME-TX-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum CanFrameTxBehaviorEnumSimple {

@XmlEnumValue("CAN-20")
CAN_20("CAN-20"),

@XmlEnumValue("CAN-FD")
CAN_FD("CAN-FD");


    private final java.lang.String value;

    CanFrameTxBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanFrameTxBehaviorEnumSimple fromValue(java.lang.String v) {
        for (CanFrameTxBehaviorEnumSimple c: CanFrameTxBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}