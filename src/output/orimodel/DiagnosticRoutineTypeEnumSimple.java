package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-ROUTINE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticRoutineTypeEnumSimple {

@XmlEnumValue("ASYNCHRONOUS")
ASYNCHRONOUS("ASYNCHRONOUS"),

@XmlEnumValue("SYNCHRONOUS")
SYNCHRONOUS("SYNCHRONOUS");


    private final java.lang.String value;

    DiagnosticRoutineTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRoutineTypeEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticRoutineTypeEnumSimple c: DiagnosticRoutineTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}