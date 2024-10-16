package stdgui.data.model.orimodel;

@XmlType(name="BSW-SERVICE-DEPENDENCY-IDENT--SUBTYPES-ENUM")
@XmlEnum
public enum BswServiceDependencyIdentSubtypesEnum {

@XmlEnumValue("BSW-SERVICE-DEPENDENCY-IDENT")
BSW_SERVICE_DEPENDENCY_IDENT("BSW-SERVICE-DEPENDENCY-IDENT");


    private final java.lang.String value;

    BswServiceDependencyIdentSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswServiceDependencyIdentSubtypesEnum fromValue(java.lang.String v) {
        for (BswServiceDependencyIdentSubtypesEnum c: BswServiceDependencyIdentSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}