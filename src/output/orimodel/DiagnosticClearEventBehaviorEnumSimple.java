package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-CLEAR-EVENT-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticClearEventBehaviorEnumSimple {

@XmlEnumValue("NO-STATUS-BYTE-CHANGE")
NO_STATUS_BYTE_CHANGE("NO-STATUS-BYTE-CHANGE"),

@XmlEnumValue("ONLY-THIS-CYCLE-AND-READINESS")
ONLY_THIS_CYCLE_AND_READINESS("ONLY-THIS-CYCLE-AND-READINESS");


    private final java.lang.String value;

    DiagnosticClearEventBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticClearEventBehaviorEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticClearEventBehaviorEnumSimple c: DiagnosticClearEventBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}