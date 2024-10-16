package stdgui.data.model.orimodel;

@XmlType(name="KEY-USAGE-RESTRICTION-ENUM--SIMPLE")
@XmlEnum
public enum KeyUsageRestrictionEnumSimple {

@XmlEnumValue("GENERATE")
GENERATE("GENERATE"),

@XmlEnumValue("GENERATE-AND-VERIFY")
GENERATE_AND_VERIFY("GENERATE-AND-VERIFY"),

@XmlEnumValue("VERIFY")
VERIFY("VERIFY");


    private final java.lang.String value;

    KeyUsageRestrictionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static KeyUsageRestrictionEnumSimple fromValue(java.lang.String v) {
        for (KeyUsageRestrictionEnumSimple c: KeyUsageRestrictionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}