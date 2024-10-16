package stdgui.data.model.orimodel;

@XmlType(name="SW-VARIABLE-ACCESS-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SwVariableAccessImplPolicyEnumSimple {

@XmlEnumValue("DIRECT")
DIRECT("DIRECT"),

@XmlEnumValue("OPTIMIZED")
OPTIMIZED("OPTIMIZED"),

@XmlEnumValue("SELECTABLE")
SELECTABLE("SELECTABLE");


    private final java.lang.String value;

    SwVariableAccessImplPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwVariableAccessImplPolicyEnumSimple fromValue(java.lang.String v) {
        for (SwVariableAccessImplPolicyEnumSimple c: SwVariableAccessImplPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}