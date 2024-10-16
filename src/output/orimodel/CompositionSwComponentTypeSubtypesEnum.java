package stdgui.data.model.orimodel;

@XmlType(name="COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum CompositionSwComponentTypeSubtypesEnum {

@XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
COMPOSITION_SW_COMPONENT_TYPE("COMPOSITION-SW-COMPONENT-TYPE");


    private final java.lang.String value;

    CompositionSwComponentTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CompositionSwComponentTypeSubtypesEnum fromValue(java.lang.String v) {
        for (CompositionSwComponentTypeSubtypesEnum c: CompositionSwComponentTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}