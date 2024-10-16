package stdgui.data.model.orimodel;

@XmlType(name="SW-ADDR-METHOD--SUBTYPES-ENUM")
@XmlEnum
public enum SwAddrMethodSubtypesEnum {

@XmlEnumValue("SW-ADDR-METHOD")
SW_ADDR_METHOD("SW-ADDR-METHOD");


    private final java.lang.String value;

    SwAddrMethodSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwAddrMethodSubtypesEnum fromValue(java.lang.String v) {
        for (SwAddrMethodSubtypesEnum c: SwAddrMethodSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}