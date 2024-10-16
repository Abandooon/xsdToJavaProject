package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-DATA-IDENTIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDataIdentifierSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER")
DIAGNOSTIC_DATA_IDENTIFIER("DIAGNOSTIC-DATA-IDENTIFIER");


    private final java.lang.String value;

    DiagnosticDataIdentifierSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDataIdentifierSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDataIdentifierSubtypesEnum c: DiagnosticDataIdentifierSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}