package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-SESSION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticSessionSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-SESSION")
DIAGNOSTIC_SESSION("DIAGNOSTIC-SESSION");


    private final java.lang.String value;

    DiagnosticSessionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticSessionSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticSessionSubtypesEnum c: DiagnosticSessionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}