package stdgui.data.model.orimodel;

@XmlType(name="MEMORY-SECTION--SUBTYPES-ENUM")
@XmlEnum
public enum MemorySectionSubtypesEnum {

@XmlEnumValue("MEMORY-SECTION")
MEMORY_SECTION("MEMORY-SECTION");


    private final java.lang.String value;

    MemorySectionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MemorySectionSubtypesEnum fromValue(java.lang.String v) {
        for (MemorySectionSubtypesEnum c: MemorySectionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}