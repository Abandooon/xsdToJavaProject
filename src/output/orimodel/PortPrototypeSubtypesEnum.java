package stdgui.data.model.orimodel;

@XmlType(name="PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum PortPrototypeSubtypesEnum {

@XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
ABSTRACT_PROVIDED_PORT_PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),

@XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
ABSTRACT_REQUIRED_PORT_PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),

@XmlEnumValue("P-PORT-PROTOTYPE")
P_PORT_PROTOTYPE("P-PORT-PROTOTYPE"),

@XmlEnumValue("PR-PORT-PROTOTYPE")
PR_PORT_PROTOTYPE("PR-PORT-PROTOTYPE"),

@XmlEnumValue("PORT-PROTOTYPE")
PORT_PROTOTYPE("PORT-PROTOTYPE"),

@XmlEnumValue("R-PORT-PROTOTYPE")
R_PORT_PROTOTYPE("R-PORT-PROTOTYPE");


    private final java.lang.String value;

    PortPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PortPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (PortPrototypeSubtypesEnum c: PortPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}