package stdgui.data.model.orimodel;

@XmlType(name="SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM")
@XmlEnum
public enum SerializationTechnologySubtypesEnum {

@XmlEnumValue("SERIALIZATION-TECHNOLOGY")
SERIALIZATION_TECHNOLOGY("SERIALIZATION-TECHNOLOGY");


    private final java.lang.String value;

    SerializationTechnologySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SerializationTechnologySubtypesEnum fromValue(java.lang.String v) {
        for (SerializationTechnologySubtypesEnum c: SerializationTechnologySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}