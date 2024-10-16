package stdgui.data.model.orimodel;

@XmlType(name="ECUC-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum EcucScopeEnumSimple {

@XmlEnumValue("ECU")
ECU("ECU"),

@XmlEnumValue("LOCAL")
LOCAL("LOCAL");


    private final java.lang.String value;

    EcucScopeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucScopeEnumSimple fromValue(java.lang.String v) {
        for (EcucScopeEnumSimple c: EcucScopeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}