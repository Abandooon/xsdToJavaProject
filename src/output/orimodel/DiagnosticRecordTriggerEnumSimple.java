package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-RECORD-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticRecordTriggerEnumSimple {

@XmlEnumValue("CONFIRMED")
CONFIRMED("CONFIRMED"),

@XmlEnumValue("FDC-THRESHOLD")
FDC_THRESHOLD("FDC-THRESHOLD"),

@XmlEnumValue("PENDING")
PENDING("PENDING"),

@XmlEnumValue("TEST-FAILED")
TEST_FAILED("TEST-FAILED");


    private final java.lang.String value;

    DiagnosticRecordTriggerEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRecordTriggerEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticRecordTriggerEnumSimple c: DiagnosticRecordTriggerEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}