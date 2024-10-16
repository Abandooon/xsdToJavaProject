package stdgui.data.model.orimodel;

@XmlType(name="ECU-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum EcuInstanceSubtypesEnum {

@XmlEnumValue("ECU-INSTANCE")
ECU_INSTANCE("ECU-INSTANCE");


    private final java.lang.String value;

    EcuInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcuInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (EcuInstanceSubtypesEnum c: EcuInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}