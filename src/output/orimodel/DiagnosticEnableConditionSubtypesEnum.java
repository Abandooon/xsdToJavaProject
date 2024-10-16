package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-ENABLE-CONDITION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticEnableConditionSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION")
DIAGNOSTIC_ENABLE_CONDITION("DIAGNOSTIC-ENABLE-CONDITION");


    private final java.lang.String value;

    DiagnosticEnableConditionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEnableConditionSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticEnableConditionSubtypesEnum c: DiagnosticEnableConditionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}