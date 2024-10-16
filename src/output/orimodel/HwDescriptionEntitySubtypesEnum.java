package stdgui.data.model.orimodel;

@XmlType(name="HW-DESCRIPTION-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum HwDescriptionEntitySubtypesEnum {

@XmlEnumValue("HW-DESCRIPTION-ENTITY")
HW_DESCRIPTION_ENTITY("HW-DESCRIPTION-ENTITY"),

@XmlEnumValue("HW-ELEMENT")
HW_ELEMENT("HW-ELEMENT"),

@XmlEnumValue("HW-PIN")
HW_PIN("HW-PIN"),

@XmlEnumValue("HW-PIN-GROUP")
HW_PIN_GROUP("HW-PIN-GROUP"),

@XmlEnumValue("HW-TYPE")
HW_TYPE("HW-TYPE");


    private final java.lang.String value;

    HwDescriptionEntitySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwDescriptionEntitySubtypesEnum fromValue(java.lang.String v) {
        for (HwDescriptionEntitySubtypesEnum c: HwDescriptionEntitySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}