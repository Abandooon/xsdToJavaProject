package stdgui.data.model.orimodel;

@XmlType(name="E-ENUM--SIMPLE")
@XmlEnum
public enum EEnumSimple {

@XmlEnumValue("BOLD")
BOLD("BOLD"),

@XmlEnumValue("BOLDITALIC")
BOLDITALIC("BOLDITALIC"),

@XmlEnumValue("ITALIC")
ITALIC("ITALIC"),

@XmlEnumValue("PLAIN")
PLAIN("PLAIN");


    private final java.lang.String value;

    EEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EEnumSimple fromValue(java.lang.String v) {
        for (EEnumSimple c: EEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}