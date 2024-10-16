package stdgui.data.model.orimodel;

@XmlType(name="CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM")
@XmlEnum
public enum CalibrationParameterValueSetSubtypesEnum {

@XmlEnumValue("CALIBRATION-PARAMETER-VALUE-SET")
CALIBRATION_PARAMETER_VALUE_SET("CALIBRATION-PARAMETER-VALUE-SET");


    private final java.lang.String value;

    CalibrationParameterValueSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CalibrationParameterValueSetSubtypesEnum fromValue(java.lang.String v) {
        for (CalibrationParameterValueSetSubtypesEnum c: CalibrationParameterValueSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}