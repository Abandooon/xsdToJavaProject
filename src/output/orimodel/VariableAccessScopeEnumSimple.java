package stdgui.data.model.orimodel;

@XmlType(name="VARIABLE-ACCESS-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum VariableAccessScopeEnumSimple {

@XmlEnumValue("COMMUNICATION-INTER-ECU")
COMMUNICATION_INTER_ECU("COMMUNICATION-INTER-ECU"),

@XmlEnumValue("COMMUNICATION-INTRA-PARTITION")
COMMUNICATION_INTRA_PARTITION("COMMUNICATION-INTRA-PARTITION"),

@XmlEnumValue("INTER-PARTITION-INTRA-ECU")
INTER_PARTITION_INTRA_ECU("INTER-PARTITION-INTRA-ECU");


    private final java.lang.String value;

    VariableAccessScopeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static VariableAccessScopeEnumSimple fromValue(java.lang.String v) {
        for (VariableAccessScopeEnumSimple c: VariableAccessScopeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}