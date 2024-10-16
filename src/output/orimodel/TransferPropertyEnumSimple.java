package stdgui.data.model.orimodel;

@XmlType(name="TRANSFER-PROPERTY-ENUM--SIMPLE")
@XmlEnum
public enum TransferPropertyEnumSimple {

@XmlEnumValue("PENDING")
PENDING("PENDING"),

@XmlEnumValue("TRIGGERED")
TRIGGERED("TRIGGERED"),

@XmlEnumValue("TRIGGERED-ON-CHANGE")
TRIGGERED_ON_CHANGE("TRIGGERED-ON-CHANGE"),

@XmlEnumValue("TRIGGERED-ON-CHANGE-WITHOUT-REPETITION")
TRIGGERED_ON_CHANGE_WITHOUT_REPETITION("TRIGGERED-ON-CHANGE-WITHOUT-REPETITION"),

@XmlEnumValue("TRIGGERED-WITHOUT-REPETITION")
TRIGGERED_WITHOUT_REPETITION("TRIGGERED-WITHOUT-REPETITION");


    private final java.lang.String value;

    TransferPropertyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TransferPropertyEnumSimple fromValue(java.lang.String v) {
        for (TransferPropertyEnumSimple c: TransferPropertyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}