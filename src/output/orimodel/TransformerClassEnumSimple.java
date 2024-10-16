package stdgui.data.model.orimodel;

@XmlType(name="TRANSFORMER-CLASS-ENUM--SIMPLE")
@XmlEnum
public enum TransformerClassEnumSimple {

@XmlEnumValue("CUSTOM")
CUSTOM("CUSTOM"),

@XmlEnumValue("SAFETY")
SAFETY("SAFETY"),

@XmlEnumValue("SECURITY")
SECURITY("SECURITY"),

@XmlEnumValue("SERIALIZER")
SERIALIZER("SERIALIZER");


    private final java.lang.String value;

    TransformerClassEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TransformerClassEnumSimple fromValue(java.lang.String v) {
        for (TransformerClassEnumSimple c: TransformerClassEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}