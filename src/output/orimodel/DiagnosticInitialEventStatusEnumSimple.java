package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-INITIAL-EVENT-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticInitialEventStatusEnumSimple {

@XmlEnumValue("RETURN-ON-EVENT-CLEARED")
RETURN_ON_EVENT_CLEARED("RETURN-ON-EVENT-CLEARED"),

@XmlEnumValue("RETURN-ON-EVENT-STOPPED")
RETURN_ON_EVENT_STOPPED("RETURN-ON-EVENT-STOPPED");


    private final java.lang.String value;

    DiagnosticInitialEventStatusEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticInitialEventStatusEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticInitialEventStatusEnumSimple c: DiagnosticInitialEventStatusEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}