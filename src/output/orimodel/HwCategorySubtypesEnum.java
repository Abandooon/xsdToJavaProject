package stdgui.data.model.orimodel;

@XmlType(name="HW-CATEGORY--SUBTYPES-ENUM")
@XmlEnum
public enum HwCategorySubtypesEnum {

@XmlEnumValue("HW-CATEGORY")
HW_CATEGORY("HW-CATEGORY");


    private final java.lang.String value;

    HwCategorySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwCategorySubtypesEnum fromValue(java.lang.String v) {
        for (HwCategorySubtypesEnum c: HwCategorySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}