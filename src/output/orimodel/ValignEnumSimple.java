package stdgui.data.model.orimodel;

@XmlType(name="VALIGN-ENUM--SIMPLE")
@XmlEnum
public enum ValignEnumSimple {

@XmlEnumValue("BOTTOM")
BOTTOM("BOTTOM"),

@XmlEnumValue("MIDDLE")
MIDDLE("MIDDLE"),

@XmlEnumValue("TOP")
TOP("TOP");


    private final java.lang.String value;

    ValignEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ValignEnumSimple fromValue(java.lang.String v) {
        for (ValignEnumSimple c: ValignEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}