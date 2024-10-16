package stdgui.data.model.orimodel;

@XmlType(name="SW-AXIS-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SwAxisTypeSubtypesEnum {

@XmlEnumValue("SW-AXIS-TYPE")
SW_AXIS_TYPE("SW-AXIS-TYPE");


    private final java.lang.String value;

    SwAxisTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwAxisTypeSubtypesEnum fromValue(java.lang.String v) {
        for (SwAxisTypeSubtypesEnum c: SwAxisTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}