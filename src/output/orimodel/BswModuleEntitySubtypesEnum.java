package stdgui.data.model.orimodel;

@XmlType(name="BSW-MODULE-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum BswModuleEntitySubtypesEnum {

@XmlEnumValue("BSW-CALLED-ENTITY")
BSW_CALLED_ENTITY("BSW-CALLED-ENTITY"),

@XmlEnumValue("BSW-INTERRUPT-ENTITY")
BSW_INTERRUPT_ENTITY("BSW-INTERRUPT-ENTITY"),

@XmlEnumValue("BSW-MODULE-ENTITY")
BSW_MODULE_ENTITY("BSW-MODULE-ENTITY"),

@XmlEnumValue("BSW-SCHEDULABLE-ENTITY")
BSW_SCHEDULABLE_ENTITY("BSW-SCHEDULABLE-ENTITY");


    private final java.lang.String value;

    BswModuleEntitySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswModuleEntitySubtypesEnum fromValue(java.lang.String v) {
        for (BswModuleEntitySubtypesEnum c: BswModuleEntitySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}