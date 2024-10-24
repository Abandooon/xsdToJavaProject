package stdgui.data.model.orimodel;

@XmlType(name="AUTO-COLLECT-ENUM--SIMPLE")
@XmlEnum
public enum AutoCollectEnumSimple {

@XmlEnumValue("REF-ALL")
REF_ALL("REF-ALL"),

@XmlEnumValue("REF-NON-STANDARD")
REF_NON_STANDARD("REF-NON-STANDARD"),

@XmlEnumValue("REF-NONE")
REF_NONE("REF-NONE");


    private final java.lang.String value;

    AutoCollectEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AutoCollectEnumSimple fromValue(java.lang.String v) {
        for (AutoCollectEnumSimple c: AutoCollectEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}