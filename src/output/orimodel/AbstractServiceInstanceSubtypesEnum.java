package stdgui.data.model.orimodel;

@XmlType(name="ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum AbstractServiceInstanceSubtypesEnum {

@XmlEnumValue("ABSTRACT-SERVICE-INSTANCE")
ABSTRACT_SERVICE_INSTANCE("ABSTRACT-SERVICE-INSTANCE"),

@XmlEnumValue("CONSUMED-SERVICE-INSTANCE")
CONSUMED_SERVICE_INSTANCE("CONSUMED-SERVICE-INSTANCE"),

@XmlEnumValue("PROVIDED-SERVICE-INSTANCE")
PROVIDED_SERVICE_INSTANCE("PROVIDED-SERVICE-INSTANCE");


    private final java.lang.String value;

    AbstractServiceInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AbstractServiceInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (AbstractServiceInstanceSubtypesEnum c: AbstractServiceInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}