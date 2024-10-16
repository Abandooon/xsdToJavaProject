package stdgui.data.model.orimodel;

@XmlType(name="LATENCY-CONSTRAINT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum LatencyConstraintTypeEnumSimple {

@XmlEnumValue("AGE")
AGE("AGE"),

@XmlEnumValue("REACTION")
REACTION("REACTION");


    private final java.lang.String value;

    LatencyConstraintTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LatencyConstraintTypeEnumSimple fromValue(java.lang.String v) {
        for (LatencyConstraintTypeEnumSimple c: LatencyConstraintTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}