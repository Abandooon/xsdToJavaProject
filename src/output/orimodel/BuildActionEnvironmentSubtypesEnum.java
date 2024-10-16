package stdgui.data.model.orimodel;

@XmlType(name="BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM")
@XmlEnum
public enum BuildActionEnvironmentSubtypesEnum {

@XmlEnumValue("BUILD-ACTION-ENVIRONMENT")
BUILD_ACTION_ENVIRONMENT("BUILD-ACTION-ENVIRONMENT");


    private final java.lang.String value;

    BuildActionEnvironmentSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BuildActionEnvironmentSubtypesEnum fromValue(java.lang.String v) {
        for (BuildActionEnvironmentSubtypesEnum c: BuildActionEnvironmentSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}