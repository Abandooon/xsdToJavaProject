package stdgui.data.model.orimodel;

@XmlType(name="ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum RootSwCompositionPrototypeSubtypesEnum {

@XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
ROOT_SW_COMPOSITION_PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE");


    private final java.lang.String value;

    RootSwCompositionPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RootSwCompositionPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (RootSwCompositionPrototypeSubtypesEnum c: RootSwCompositionPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}