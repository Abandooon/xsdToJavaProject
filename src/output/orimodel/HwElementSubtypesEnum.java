package stdgui.data.model.orimodel;

@XmlType(name="HW-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum HwElementSubtypesEnum {

@XmlEnumValue("HW-ELEMENT")
HW_ELEMENT("HW-ELEMENT");


    private final java.lang.String value;

    HwElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwElementSubtypesEnum fromValue(java.lang.String v) {
        for (HwElementSubtypesEnum c: HwElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}