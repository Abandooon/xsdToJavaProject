package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-EVENT-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticEventNeedsSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-EVENT-NEEDS")
DIAGNOSTIC_EVENT_NEEDS("DIAGNOSTIC-EVENT-NEEDS");


    private final java.lang.String value;

    DiagnosticEventNeedsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventNeedsSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticEventNeedsSubtypesEnum c: DiagnosticEventNeedsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}