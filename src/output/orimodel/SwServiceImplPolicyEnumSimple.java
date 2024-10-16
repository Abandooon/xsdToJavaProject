package stdgui.data.model.orimodel;

@XmlType(name="SW-SERVICE-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SwServiceImplPolicyEnumSimple {

@XmlEnumValue("INLINE")
INLINE("INLINE"),

@XmlEnumValue("INLINE-CONDITIONAL")
INLINE_CONDITIONAL("INLINE-CONDITIONAL"),

@XmlEnumValue("MACRO")
MACRO("MACRO"),

@XmlEnumValue("STANDARD")
STANDARD("STANDARD");


    private final java.lang.String value;

    SwServiceImplPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwServiceImplPolicyEnumSimple fromValue(java.lang.String v) {
        for (SwServiceImplPolicyEnumSimple c: SwServiceImplPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}