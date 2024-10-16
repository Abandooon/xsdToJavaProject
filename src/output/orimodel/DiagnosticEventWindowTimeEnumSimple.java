package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-EVENT-WINDOW-TIME-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticEventWindowTimeEnumSimple {

@XmlEnumValue("EVENT-WINDOW-CURRENT-AND-FOLLOWING-CYCLE")
EVENT_WINDOW_CURRENT_AND_FOLLOWING_CYCLE("EVENT-WINDOW-CURRENT-AND-FOLLOWING-CYCLE"),

@XmlEnumValue("EVENT-WINDOW-CURRENT-CYCLE")
EVENT_WINDOW_CURRENT_CYCLE("EVENT-WINDOW-CURRENT-CYCLE"),

@XmlEnumValue("EVENT-WINDOW-INFINITE")
EVENT_WINDOW_INFINITE("EVENT-WINDOW-INFINITE");


    private final java.lang.String value;

    DiagnosticEventWindowTimeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventWindowTimeEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticEventWindowTimeEnumSimple c: DiagnosticEventWindowTimeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}