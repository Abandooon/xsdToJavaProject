package stdgui.data.model.orimodel;

@XmlType(name="TP-ACK-TYPE--SIMPLE")
@XmlEnum
public enum TpAckTypeSimple {

@XmlEnumValue("ACK-WITH-RT")
ACK_WITH_RT("ACK-WITH-RT"),

@XmlEnumValue("NO-ACK")
NO_ACK("NO-ACK");


    private final java.lang.String value;

    TpAckTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TpAckTypeSimple fromValue(java.lang.String v) {
        for (TpAckTypeSimple c: TpAckTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}