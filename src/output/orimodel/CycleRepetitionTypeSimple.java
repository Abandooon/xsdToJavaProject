package stdgui.data.model.orimodel;

@XmlType(name="CYCLE-REPETITION-TYPE--SIMPLE")
@XmlEnum
public enum CycleRepetitionTypeSimple {

@XmlEnumValue("CYCLE-REPETITION-1")
CYCLE_REPETITION_1("CYCLE-REPETITION-1"),

@XmlEnumValue("CYCLE-REPETITION-10")
CYCLE_REPETITION_10("CYCLE-REPETITION-10"),

@XmlEnumValue("CYCLE-REPETITION-16")
CYCLE_REPETITION_16("CYCLE-REPETITION-16"),

@XmlEnumValue("CYCLE-REPETITION-2")
CYCLE_REPETITION_2("CYCLE-REPETITION-2"),

@XmlEnumValue("CYCLE-REPETITION-20")
CYCLE_REPETITION_20("CYCLE-REPETITION-20"),

@XmlEnumValue("CYCLE-REPETITION-32")
CYCLE_REPETITION_32("CYCLE-REPETITION-32"),

@XmlEnumValue("CYCLE-REPETITION-4")
CYCLE_REPETITION_4("CYCLE-REPETITION-4"),

@XmlEnumValue("CYCLE-REPETITION-40")
CYCLE_REPETITION_40("CYCLE-REPETITION-40"),

@XmlEnumValue("CYCLE-REPETITION-5")
CYCLE_REPETITION_5("CYCLE-REPETITION-5"),

@XmlEnumValue("CYCLE-REPETITION-50")
CYCLE_REPETITION_50("CYCLE-REPETITION-50"),

@XmlEnumValue("CYCLE-REPETITION-64")
CYCLE_REPETITION_64("CYCLE-REPETITION-64"),

@XmlEnumValue("CYCLE-REPETITION-8")
CYCLE_REPETITION_8("CYCLE-REPETITION-8");


    private final java.lang.String value;

    CycleRepetitionTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CycleRepetitionTypeSimple fromValue(java.lang.String v) {
        for (CycleRepetitionTypeSimple c: CycleRepetitionTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}