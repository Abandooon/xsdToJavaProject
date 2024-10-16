package stdgui.data.model.orimodel;

@XmlType(name="EXECUTABLE-ENTITY-ACTIVATION-REASON--SUBTYPES-ENUM")
@XmlEnum
public enum ExecutableEntityActivationReasonSubtypesEnum {

@XmlEnumValue("EXECUTABLE-ENTITY-ACTIVATION-REASON")
EXECUTABLE_ENTITY_ACTIVATION_REASON("EXECUTABLE-ENTITY-ACTIVATION-REASON");


    private final java.lang.String value;

    ExecutableEntityActivationReasonSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExecutableEntityActivationReasonSubtypesEnum fromValue(java.lang.String v) {
        for (ExecutableEntityActivationReasonSubtypesEnum c: ExecutableEntityActivationReasonSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}