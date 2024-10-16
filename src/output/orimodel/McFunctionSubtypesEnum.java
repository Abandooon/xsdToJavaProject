package stdgui.data.model.orimodel;

@XmlType(name="MC-FUNCTION--SUBTYPES-ENUM")
@XmlEnum
public enum McFunctionSubtypesEnum {

@XmlEnumValue("MC-FUNCTION")
MC_FUNCTION("MC-FUNCTION");


    private final java.lang.String value;

    McFunctionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static McFunctionSubtypesEnum fromValue(java.lang.String v) {
        for (McFunctionSubtypesEnum c: McFunctionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}