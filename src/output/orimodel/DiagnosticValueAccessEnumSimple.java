package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-VALUE-ACCESS-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticValueAccessEnumSimple {

@XmlEnumValue("READ-ONLY")
READ_ONLY("READ-ONLY"),

@XmlEnumValue("READ-WRITE")
READ_WRITE("READ-WRITE"),

@XmlEnumValue("WRITE-ONLY")
WRITE_ONLY("WRITE-ONLY");


    private final java.lang.String value;

    DiagnosticValueAccessEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticValueAccessEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticValueAccessEnumSimple c: DiagnosticValueAccessEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}