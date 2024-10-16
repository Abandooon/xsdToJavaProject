package stdgui.data.model.orimodel;

@XmlType(name="HANDLE-OUT-OF-RANGE-ENUM--SIMPLE")
@XmlEnum
public enum HandleOutOfRangeEnumSimple {

@XmlEnumValue("DEFAULT")
DEFAULT("DEFAULT"),

@XmlEnumValue("EXTERNAL-REPLACEMENT")
EXTERNAL_REPLACEMENT("EXTERNAL-REPLACEMENT"),

@XmlEnumValue("IGNORE")
IGNORE("IGNORE"),

@XmlEnumValue("INVALID")
INVALID("INVALID"),

@XmlEnumValue("NONE")
NONE("NONE"),

@XmlEnumValue("SATURATE")
SATURATE("SATURATE");


    private final java.lang.String value;

    HandleOutOfRangeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandleOutOfRangeEnumSimple fromValue(java.lang.String v) {
        for (HandleOutOfRangeEnumSimple c: HandleOutOfRangeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}