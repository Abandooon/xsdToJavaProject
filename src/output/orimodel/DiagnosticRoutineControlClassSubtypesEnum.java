package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-ROUTINE-CONTROL-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticRoutineControlClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL-CLASS")
DIAGNOSTIC_ROUTINE_CONTROL_CLASS("DIAGNOSTIC-ROUTINE-CONTROL-CLASS");


    private final java.lang.String value;

    DiagnosticRoutineControlClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRoutineControlClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticRoutineControlClassSubtypesEnum c: DiagnosticRoutineControlClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}