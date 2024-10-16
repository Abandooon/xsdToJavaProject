package stdgui.data.model.orimodel;

@XmlType(name="SECTION-NAME-PREFIX--SUBTYPES-ENUM")
@XmlEnum
public enum SectionNamePrefixSubtypesEnum {

@XmlEnumValue("SECTION-NAME-PREFIX")
SECTION_NAME_PREFIX("SECTION-NAME-PREFIX");


    private final java.lang.String value;

    SectionNamePrefixSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SectionNamePrefixSubtypesEnum fromValue(java.lang.String v) {
        for (SectionNamePrefixSubtypesEnum c: SectionNamePrefixSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}