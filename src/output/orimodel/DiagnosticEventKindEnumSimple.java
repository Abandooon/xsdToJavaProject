package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-EVENT-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticEventKindEnumSimple {

@XmlEnumValue("BSW")
BSW("BSW"),

@XmlEnumValue("SWC")
SWC("SWC");


    private final java.lang.String value;

    DiagnosticEventKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventKindEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticEventKindEnumSimple c: DiagnosticEventKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}