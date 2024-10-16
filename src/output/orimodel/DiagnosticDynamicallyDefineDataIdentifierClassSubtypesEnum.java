package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS")
DIAGNOSTIC_DYNAMICALLY_DEFINE_DATA_IDENTIFIER_CLASS("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS");


    private final java.lang.String value;

    DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum c: DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}