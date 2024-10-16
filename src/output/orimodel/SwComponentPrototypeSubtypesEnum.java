package stdgui.data.model.orimodel;

@XmlType(name="SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SwComponentPrototypeSubtypesEnum {

@XmlEnumValue("SW-COMPONENT-PROTOTYPE")
SW_COMPONENT_PROTOTYPE("SW-COMPONENT-PROTOTYPE");


    private final java.lang.String value;

    SwComponentPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwComponentPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (SwComponentPrototypeSubtypesEnum c: SwComponentPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}