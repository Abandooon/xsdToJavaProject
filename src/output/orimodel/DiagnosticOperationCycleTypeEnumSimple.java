package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-OPERATION-CYCLE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticOperationCycleTypeEnumSimple {

@XmlEnumValue("IGNITION")
IGNITION("IGNITION"),

@XmlEnumValue("OBD-DRIVING-CYCLE")
OBD_DRIVING_CYCLE("OBD-DRIVING-CYCLE"),

@XmlEnumValue("OTHER")
OTHER("OTHER"),

@XmlEnumValue("POWER")
POWER("POWER"),

@XmlEnumValue("TIME")
TIME("TIME"),

@XmlEnumValue("WARMUP")
WARMUP("WARMUP");


    private final java.lang.String value;

    DiagnosticOperationCycleTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOperationCycleTypeEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticOperationCycleTypeEnumSimple c: DiagnosticOperationCycleTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}