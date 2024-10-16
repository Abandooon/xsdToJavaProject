package stdgui.data.model.orimodel;

@XmlType(name="ETHERNET-CONNECTION-NEGOTIATION-ENUM--SIMPLE")
@XmlEnum
public enum EthernetConnectionNegotiationEnumSimple {

@XmlEnumValue("AUTO")
AUTO("AUTO"),

@XmlEnumValue("MASTER")
MASTER("MASTER"),

@XmlEnumValue("SLAVE")
SLAVE("SLAVE");


    private final java.lang.String value;

    EthernetConnectionNegotiationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetConnectionNegotiationEnumSimple fromValue(java.lang.String v) {
        for (EthernetConnectionNegotiationEnumSimple c: EthernetConnectionNegotiationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}