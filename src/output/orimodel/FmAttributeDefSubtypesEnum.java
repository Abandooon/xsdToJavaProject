package stdgui.data.model.orimodel;

@XmlType(name="FM-ATTRIBUTE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum FmAttributeDefSubtypesEnum {

@XmlEnumValue("FM-ATTRIBUTE-DEF")
FM_ATTRIBUTE_DEF("FM-ATTRIBUTE-DEF");


    private final java.lang.String value;

    FmAttributeDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FmAttributeDefSubtypesEnum fromValue(java.lang.String v) {
        for (FmAttributeDefSubtypesEnum c: FmAttributeDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}