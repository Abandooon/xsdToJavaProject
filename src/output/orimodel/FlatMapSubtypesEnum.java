package stdgui.data.model.orimodel;

@XmlType(name="FLAT-MAP--SUBTYPES-ENUM")
@XmlEnum
public enum FlatMapSubtypesEnum {

@XmlEnumValue("FLAT-MAP")
FLAT_MAP("FLAT-MAP");


    private final java.lang.String value;

    FlatMapSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlatMapSubtypesEnum fromValue(java.lang.String v) {
        for (FlatMapSubtypesEnum c: FlatMapSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}