package stdgui.data.model.orimodel;

@XmlType(name="DO-IP-LOGIC-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum DoIpLogicAddressSubtypesEnum {

@XmlEnumValue("DO-IP-LOGIC-ADDRESS")
DO_IP_LOGIC_ADDRESS("DO-IP-LOGIC-ADDRESS");


    private final java.lang.String value;

    DoIpLogicAddressSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DoIpLogicAddressSubtypesEnum fromValue(java.lang.String v) {
        for (DoIpLogicAddressSubtypesEnum c: DoIpLogicAddressSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}