package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-SIGNIFICANCE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticSignificanceEnumSimple {

@XmlEnumValue("FAULT")
FAULT("FAULT"),

@XmlEnumValue("OCCURENCE")
OCCURENCE("OCCURENCE");


    private final java.lang.String value;

    DiagnosticSignificanceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticSignificanceEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticSignificanceEnumSimple c: DiagnosticSignificanceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}