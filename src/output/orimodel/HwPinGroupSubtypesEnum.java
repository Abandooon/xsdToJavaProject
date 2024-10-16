package stdgui.data.model.orimodel;

@XmlType(name="HW-PIN-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum HwPinGroupSubtypesEnum {

@XmlEnumValue("HW-PIN-GROUP")
HW_PIN_GROUP("HW-PIN-GROUP");


    private final java.lang.String value;

    HwPinGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwPinGroupSubtypesEnum fromValue(java.lang.String v) {
        for (HwPinGroupSubtypesEnum c: HwPinGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}