package stdgui.data.model.orimodel;

@XmlType(name="FRAME-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum FrameTriggeringSubtypesEnum {

@XmlEnumValue("CAN-FRAME-TRIGGERING")
CAN_FRAME_TRIGGERING("CAN-FRAME-TRIGGERING"),

@XmlEnumValue("ETHERNET-FRAME-TRIGGERING")
ETHERNET_FRAME_TRIGGERING("ETHERNET-FRAME-TRIGGERING"),

@XmlEnumValue("FLEXRAY-FRAME-TRIGGERING")
FLEXRAY_FRAME_TRIGGERING("FLEXRAY-FRAME-TRIGGERING"),

@XmlEnumValue("FRAME-TRIGGERING")
FRAME_TRIGGERING("FRAME-TRIGGERING"),

@XmlEnumValue("LIN-FRAME-TRIGGERING")
LIN_FRAME_TRIGGERING("LIN-FRAME-TRIGGERING");


    private final java.lang.String value;

    FrameTriggeringSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FrameTriggeringSubtypesEnum fromValue(java.lang.String v) {
        for (FrameTriggeringSubtypesEnum c: FrameTriggeringSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}