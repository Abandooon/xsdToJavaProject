package stdgui.data.model.orimodel;

@XmlType(name="AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AutosarDataPrototypeSubtypesEnum {

@XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
ARGUMENT_DATA_PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),

@XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
AUTOSAR_DATA_PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),

@XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
PARAMETER_DATA_PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),

@XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
VARIABLE_DATA_PROTOTYPE("VARIABLE-DATA-PROTOTYPE");


    private final java.lang.String value;

    AutosarDataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AutosarDataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (AutosarDataPrototypeSubtypesEnum c: AutosarDataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}