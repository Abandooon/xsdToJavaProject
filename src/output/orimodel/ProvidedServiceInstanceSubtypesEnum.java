package stdgui.data.model.orimodel;

@XmlType(name="PROVIDED-SERVICE-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum ProvidedServiceInstanceSubtypesEnum {

@XmlEnumValue("PROVIDED-SERVICE-INSTANCE")
PROVIDED_SERVICE_INSTANCE("PROVIDED-SERVICE-INSTANCE");


    private final java.lang.String value;

    ProvidedServiceInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProvidedServiceInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (ProvidedServiceInstanceSubtypesEnum c: ProvidedServiceInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}