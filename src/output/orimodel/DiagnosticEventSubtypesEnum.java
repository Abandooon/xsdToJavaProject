package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticEventSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-EVENT")
DIAGNOSTIC_EVENT("DIAGNOSTIC-EVENT");


    private final java.lang.String value;

    DiagnosticEventSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticEventSubtypesEnum c: DiagnosticEventSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}