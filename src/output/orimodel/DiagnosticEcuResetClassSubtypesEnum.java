package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-ECU-RESET-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticEcuResetClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-ECU-RESET-CLASS")
DIAGNOSTIC_ECU_RESET_CLASS("DIAGNOSTIC-ECU-RESET-CLASS");


    private final java.lang.String value;

    DiagnosticEcuResetClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEcuResetClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticEcuResetClassSubtypesEnum c: DiagnosticEcuResetClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}