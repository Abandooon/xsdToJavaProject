package stdgui.data.model.orimodel;

@XmlType(name="SW-SERVICE-REENTRANCE-ENUM--SIMPLE")
@XmlEnum
public enum SwServiceReentranceEnumSimple {

@XmlEnumValue("REENTRANCE")
REENTRANCE("REENTRANCE");


    private final java.lang.String value;

    SwServiceReentranceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwServiceReentranceEnumSimple fromValue(java.lang.String v) {
        for (SwServiceReentranceEnumSimple c: SwServiceReentranceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}