package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-I-SIGNAL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventISignalTypeEnumSimple {

@XmlEnumValue("I-SIGNAL-AVAILABLE-FOR-RTE")
I_SIGNAL_AVAILABLE_FOR_RTE("I-SIGNAL-AVAILABLE-FOR-RTE"),

@XmlEnumValue("I-SIGNAL-SENT-TO-COM")
I_SIGNAL_SENT_TO_COM("I-SIGNAL-SENT-TO-COM");


    private final java.lang.String value;

    TdEventISignalTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventISignalTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventISignalTypeEnumSimple c: TdEventISignalTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}