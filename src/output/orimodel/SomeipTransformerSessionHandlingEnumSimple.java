package stdgui.data.model.orimodel;

@XmlType(name="SOMEIP-TRANSFORMER-SESSION-HANDLING-ENUM--SIMPLE")
@XmlEnum
public enum SomeipTransformerSessionHandlingEnumSimple {

@XmlEnumValue("SESSION-HANDLING-ACTIVE")
SESSION_HANDLING_ACTIVE("SESSION-HANDLING-ACTIVE"),

@XmlEnumValue("SESSION-HANDLING-INACTIVE")
SESSION_HANDLING_INACTIVE("SESSION-HANDLING-INACTIVE");


    private final java.lang.String value;

    SomeipTransformerSessionHandlingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SomeipTransformerSessionHandlingEnumSimple fromValue(java.lang.String v) {
        for (SomeipTransformerSessionHandlingEnumSimple c: SomeipTransformerSessionHandlingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}