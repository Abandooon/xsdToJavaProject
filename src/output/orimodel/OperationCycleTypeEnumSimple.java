package stdgui.data.model.orimodel;

@XmlType(name="OPERATION-CYCLE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum OperationCycleTypeEnumSimple {

@XmlEnumValue("IGNITION")
IGNITION("IGNITION"),

@XmlEnumValue("OBD-DCY")
OBD_DCY("OBD-DCY"),

@XmlEnumValue("OTHER")
OTHER("OTHER"),

@XmlEnumValue("POWER")
POWER("POWER"),

@XmlEnumValue("TIME")
TIME("TIME"),

@XmlEnumValue("WARMUP")
WARMUP("WARMUP");


    private final java.lang.String value;

    OperationCycleTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static OperationCycleTypeEnumSimple fromValue(java.lang.String v) {
        for (OperationCycleTypeEnumSimple c: OperationCycleTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}