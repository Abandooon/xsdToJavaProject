package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-MEMORY-ENTRY-STORAGE-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticMemoryEntryStorageTriggerEnumSimple {

@XmlEnumValue("CONFIRMED")
CONFIRMED("CONFIRMED"),

@XmlEnumValue("FDC-THRESHOLD")
FDC_THRESHOLD("FDC-THRESHOLD"),

@XmlEnumValue("PENDING")
PENDING("PENDING"),

@XmlEnumValue("TEST-FAILED")
TEST_FAILED("TEST-FAILED");


    private final java.lang.String value;

    DiagnosticMemoryEntryStorageTriggerEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticMemoryEntryStorageTriggerEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticMemoryEntryStorageTriggerEnumSimple c: DiagnosticMemoryEntryStorageTriggerEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}