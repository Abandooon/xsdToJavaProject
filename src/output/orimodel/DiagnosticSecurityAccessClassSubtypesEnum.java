package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-SECURITY-ACCESS-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticSecurityAccessClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS-CLASS")
DIAGNOSTIC_SECURITY_ACCESS_CLASS("DIAGNOSTIC-SECURITY-ACCESS-CLASS");


    private final java.lang.String value;

    DiagnosticSecurityAccessClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticSecurityAccessClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticSecurityAccessClassSubtypesEnum c: DiagnosticSecurityAccessClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}