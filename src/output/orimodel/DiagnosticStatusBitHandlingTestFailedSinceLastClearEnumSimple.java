package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumSimple {

@XmlEnumValue("STATUS-BIT-AGING-AND-DISPLACEMENT")
STATUS_BIT_AGING_AND_DISPLACEMENT("STATUS-BIT-AGING-AND-DISPLACEMENT"),

@XmlEnumValue("STATUS-BIT-NORMAL")
STATUS_BIT_NORMAL("STATUS-BIT-NORMAL");


    private final java.lang.String value;

    DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumSimple c: DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}