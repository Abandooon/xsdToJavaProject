package stdgui.data.model.orimodel;

@XmlType(name="PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum PhysicalChannelSubtypesEnum {

@XmlEnumValue("ABSTRACT-CAN-PHYSICAL-CHANNEL")
ABSTRACT_CAN_PHYSICAL_CHANNEL("ABSTRACT-CAN-PHYSICAL-CHANNEL"),

@XmlEnumValue("CAN-PHYSICAL-CHANNEL")
CAN_PHYSICAL_CHANNEL("CAN-PHYSICAL-CHANNEL"),

@XmlEnumValue("ETHERNET-PHYSICAL-CHANNEL")
ETHERNET_PHYSICAL_CHANNEL("ETHERNET-PHYSICAL-CHANNEL"),

@XmlEnumValue("FLEXRAY-PHYSICAL-CHANNEL")
FLEXRAY_PHYSICAL_CHANNEL("FLEXRAY-PHYSICAL-CHANNEL"),

@XmlEnumValue("LIN-PHYSICAL-CHANNEL")
LIN_PHYSICAL_CHANNEL("LIN-PHYSICAL-CHANNEL"),

@XmlEnumValue("PHYSICAL-CHANNEL")
PHYSICAL_CHANNEL("PHYSICAL-CHANNEL"),

@XmlEnumValue("TTCAN-PHYSICAL-CHANNEL")
TTCAN_PHYSICAL_CHANNEL("TTCAN-PHYSICAL-CHANNEL"),

@XmlEnumValue("USER-DEFINED-PHYSICAL-CHANNEL")
USER_DEFINED_PHYSICAL_CHANNEL("USER-DEFINED-PHYSICAL-CHANNEL");


    private final java.lang.String value;

    PhysicalChannelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PhysicalChannelSubtypesEnum fromValue(java.lang.String v) {
        for (PhysicalChannelSubtypesEnum c: PhysicalChannelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}