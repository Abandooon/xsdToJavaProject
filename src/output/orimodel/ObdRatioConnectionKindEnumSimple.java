package stdgui.data.model.orimodel;

@XmlType(name="OBD-RATIO-CONNECTION-KIND-ENUM--SIMPLE")
@XmlEnum
public enum ObdRatioConnectionKindEnumSimple {

@XmlEnumValue("API-USE")
API_USE("API-USE"),

@XmlEnumValue("OBSERVER")
OBSERVER("OBSERVER");


    private final java.lang.String value;

    ObdRatioConnectionKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ObdRatioConnectionKindEnumSimple fromValue(java.lang.String v) {
        for (ObdRatioConnectionKindEnumSimple c: ObdRatioConnectionKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}