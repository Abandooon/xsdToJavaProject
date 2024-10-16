package stdgui.data.model.orimodel;

@XmlType(name="CAN-TP-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum CanTpAddressSubtypesEnum {

@XmlEnumValue("CAN-TP-ADDRESS")
CAN_TP_ADDRESS("CAN-TP-ADDRESS");


    private final java.lang.String value;

    CanTpAddressSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanTpAddressSubtypesEnum fromValue(java.lang.String v) {
        for (CanTpAddressSubtypesEnum c: CanTpAddressSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}