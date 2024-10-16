package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticResponseOnEventClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS")
DIAGNOSTIC_RESPONSE_ON_EVENT_CLASS("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS");


    private final java.lang.String value;

    DiagnosticResponseOnEventClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticResponseOnEventClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticResponseOnEventClassSubtypesEnum c: DiagnosticResponseOnEventClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}