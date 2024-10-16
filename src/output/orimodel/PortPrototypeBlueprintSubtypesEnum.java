package stdgui.data.model.orimodel;

@XmlType(name="PORT-PROTOTYPE-BLUEPRINT--SUBTYPES-ENUM")
@XmlEnum
public enum PortPrototypeBlueprintSubtypesEnum {

@XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
PORT_PROTOTYPE_BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT");


    private final java.lang.String value;

    PortPrototypeBlueprintSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PortPrototypeBlueprintSubtypesEnum fromValue(java.lang.String v) {
        for (PortPrototypeBlueprintSubtypesEnum c: PortPrototypeBlueprintSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}