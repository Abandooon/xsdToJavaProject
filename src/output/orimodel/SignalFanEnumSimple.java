package stdgui.data.model.orimodel;

@XmlType(name="SIGNAL-FAN-ENUM--SIMPLE")
@XmlEnum
public enum SignalFanEnumSimple {

@XmlEnumValue("NFOLD")
NFOLD("NFOLD"),

@XmlEnumValue("SINGLE")
SINGLE("SINGLE");


    private final java.lang.String value;

    SignalFanEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SignalFanEnumSimple fromValue(java.lang.String v) {
        for (SignalFanEnumSimple c: SignalFanEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}