package stdgui.data.model.orimodel;

@XmlType(name="SW-BASE-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SwBaseTypeSubtypesEnum {

@XmlEnumValue("SW-BASE-TYPE")
SW_BASE_TYPE("SW-BASE-TYPE");


    private final java.lang.String value;

    SwBaseTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwBaseTypeSubtypesEnum fromValue(java.lang.String v) {
        for (SwBaseTypeSubtypesEnum c: SwBaseTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}