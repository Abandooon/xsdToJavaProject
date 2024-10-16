package stdgui.data.model.orimodel;

@XmlType(name="CAN-FRAME-RX-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum CanFrameRxBehaviorEnumSimple {

@XmlEnumValue("ANY")
ANY("ANY"),

@XmlEnumValue("CAN-20")
CAN_20("CAN-20"),

@XmlEnumValue("CAN-FD")
CAN_FD("CAN-FD");


    private final java.lang.String value;

    CanFrameRxBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanFrameRxBehaviorEnumSimple fromValue(java.lang.String v) {
        for (CanFrameRxBehaviorEnumSimple c: CanFrameRxBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}