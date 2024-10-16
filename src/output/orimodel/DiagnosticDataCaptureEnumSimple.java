package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-DATA-CAPTURE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticDataCaptureEnumSimple {

@XmlEnumValue("CAPTURE-ASYNCHRONOUSLY-TO-REPORTING")
CAPTURE_ASYNCHRONOUSLY_TO_REPORTING("CAPTURE-ASYNCHRONOUSLY-TO-REPORTING"),

@XmlEnumValue("CAPTURE-SYNCHRONOUSLY-TO-REPORTING")
CAPTURE_SYNCHRONOUSLY_TO_REPORTING("CAPTURE-SYNCHRONOUSLY-TO-REPORTING");


    private final java.lang.String value;

    DiagnosticDataCaptureEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDataCaptureEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticDataCaptureEnumSimple c: DiagnosticDataCaptureEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}