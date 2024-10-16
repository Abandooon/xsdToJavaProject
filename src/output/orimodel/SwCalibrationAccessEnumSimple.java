package stdgui.data.model.orimodel;

@XmlType(name="SW-CALIBRATION-ACCESS-ENUM--SIMPLE")
@XmlEnum
public enum SwCalibrationAccessEnumSimple {

@XmlEnumValue("NOT-ACCESSIBLE")
NOT_ACCESSIBLE("NOT-ACCESSIBLE"),

@XmlEnumValue("READ-ONLY")
READ_ONLY("READ-ONLY"),

@XmlEnumValue("READ-WRITE")
READ_WRITE("READ-WRITE");


    private final java.lang.String value;

    SwCalibrationAccessEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwCalibrationAccessEnumSimple fromValue(java.lang.String v) {
        for (SwCalibrationAccessEnumSimple c: SwCalibrationAccessEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}