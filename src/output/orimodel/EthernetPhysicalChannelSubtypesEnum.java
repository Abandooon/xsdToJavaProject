package stdgui.data.model.orimodel;

@XmlType(name="ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum EthernetPhysicalChannelSubtypesEnum {

@XmlEnumValue("ETHERNET-PHYSICAL-CHANNEL")
ETHERNET_PHYSICAL_CHANNEL("ETHERNET-PHYSICAL-CHANNEL");


    private final java.lang.String value;

    EthernetPhysicalChannelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetPhysicalChannelSubtypesEnum fromValue(java.lang.String v) {
        for (EthernetPhysicalChannelSubtypesEnum c: EthernetPhysicalChannelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}