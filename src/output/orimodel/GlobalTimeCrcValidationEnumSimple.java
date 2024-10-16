package stdgui.data.model.orimodel;

@XmlType(name="GLOBAL-TIME-CRC-VALIDATION-ENUM--SIMPLE")
@XmlEnum
public enum GlobalTimeCrcValidationEnumSimple {

@XmlEnumValue("CRC-IGNORED")
CRC_IGNORED("CRC-IGNORED"),

@XmlEnumValue("CRC-NOT-VALIDATED")
CRC_NOT_VALIDATED("CRC-NOT-VALIDATED"),

@XmlEnumValue("CRC-VALIDATED")
CRC_VALIDATED("CRC-VALIDATED");


    private final java.lang.String value;

    GlobalTimeCrcValidationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GlobalTimeCrcValidationEnumSimple fromValue(java.lang.String v) {
        for (GlobalTimeCrcValidationEnumSimple c: GlobalTimeCrcValidationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}