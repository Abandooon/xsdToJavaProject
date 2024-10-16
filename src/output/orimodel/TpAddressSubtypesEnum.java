package stdgui.data.model.orimodel;

@XmlType(name="TP-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum TpAddressSubtypesEnum {

@XmlEnumValue("TP-ADDRESS")
TP_ADDRESS("TP-ADDRESS");


    private final java.lang.String value;

    TpAddressSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TpAddressSubtypesEnum fromValue(java.lang.String v) {
        for (TpAddressSubtypesEnum c: TpAddressSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}