package stdgui.data.model.orimodel;

@XmlType(name="BSW-IMPLEMENTATION--SUBTYPES-ENUM")
@XmlEnum
public enum BswImplementationSubtypesEnum {

@XmlEnumValue("BSW-IMPLEMENTATION")
BSW_IMPLEMENTATION("BSW-IMPLEMENTATION");


    private final java.lang.String value;

    BswImplementationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswImplementationSubtypesEnum fromValue(java.lang.String v) {
        for (BswImplementationSubtypesEnum c: BswImplementationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}