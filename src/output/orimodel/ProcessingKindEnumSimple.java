package stdgui.data.model.orimodel;

@XmlType(name="PROCESSING-KIND-ENUM--SIMPLE")
@XmlEnum
public enum ProcessingKindEnumSimple {

@XmlEnumValue("FILTERED")
FILTERED("FILTERED"),

@XmlEnumValue("NONE")
NONE("NONE"),

@XmlEnumValue("RAW")
RAW("RAW");


    private final java.lang.String value;

    ProcessingKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProcessingKindEnumSimple fromValue(java.lang.String v) {
        for (ProcessingKindEnumSimple c: ProcessingKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}