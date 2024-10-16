package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-OCCURRENCE-COUNTER-PROCESSING-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticOccurrenceCounterProcessingEnumSimple {

@XmlEnumValue("CONFIRMED-DTC-BIT")
CONFIRMED_DTC_BIT("CONFIRMED-DTC-BIT"),

@XmlEnumValue("TEST-FAILED-BIT")
TEST_FAILED_BIT("TEST-FAILED-BIT");


    private final java.lang.String value;

    DiagnosticOccurrenceCounterProcessingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOccurrenceCounterProcessingEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticOccurrenceCounterProcessingEnumSimple c: DiagnosticOccurrenceCounterProcessingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}