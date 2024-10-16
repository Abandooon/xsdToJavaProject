package stdgui.data.model.orimodel;

@XmlType(name="REENTRANCY-LEVEL-ENUM--SIMPLE")
@XmlEnum
public enum ReentrancyLevelEnumSimple {

@XmlEnumValue("MULTICORE-REENTRANT")
MULTICORE_REENTRANT("MULTICORE-REENTRANT"),

@XmlEnumValue("NON-REENTRANT")
NON_REENTRANT("NON-REENTRANT"),

@XmlEnumValue("SINGLE-CORE-REENTRANT")
SINGLE_CORE_REENTRANT("SINGLE-CORE-REENTRANT");


    private final java.lang.String value;

    ReentrancyLevelEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ReentrancyLevelEnumSimple fromValue(java.lang.String v) {
        for (ReentrancyLevelEnumSimple c: ReentrancyLevelEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}