package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-UDS-SEVERITY-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticUdsSeverityEnumSimple {

@XmlEnumValue("CHECK-AT-NEXT-HALT")
CHECK_AT_NEXT_HALT("CHECK-AT-NEXT-HALT"),

@XmlEnumValue("IMMEDIATELY")
IMMEDIATELY("IMMEDIATELY"),

@XmlEnumValue("MAINTENANCE-ONLY")
MAINTENANCE_ONLY("MAINTENANCE-ONLY"),

@XmlEnumValue("NO-SEVERITY")
NO_SEVERITY("NO-SEVERITY");


    private final java.lang.String value;

    DiagnosticUdsSeverityEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticUdsSeverityEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticUdsSeverityEnumSimple c: DiagnosticUdsSeverityEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}