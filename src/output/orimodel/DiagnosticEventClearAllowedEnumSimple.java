package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-EVENT-CLEAR-ALLOWED-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticEventClearAllowedEnumSimple {

@XmlEnumValue("ALWAYS")
ALWAYS("ALWAYS"),

@XmlEnumValue("NEVER")
NEVER("NEVER"),

@XmlEnumValue("REQUIRES-CALLBACK-EXECUTION")
REQUIRES_CALLBACK_EXECUTION("REQUIRES-CALLBACK-EXECUTION");


    private final java.lang.String value;

    DiagnosticEventClearAllowedEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventClearAllowedEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticEventClearAllowedEnumSimple c: DiagnosticEventClearAllowedEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}