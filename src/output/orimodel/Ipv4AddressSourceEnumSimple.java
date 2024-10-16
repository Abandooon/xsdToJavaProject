package stdgui.data.model.orimodel;

@XmlType(name="IPV-4-ADDRESS-SOURCE-ENUM--SIMPLE")
@XmlEnum
public enum Ipv4AddressSourceEnumSimple {

@XmlEnumValue("AUTO-IP")
AUTO_IP("AUTO-IP"),

@XmlEnumValue("AUTO-IP--DOIP")
AUTO_IP__DOIP("AUTO-IP--DOIP"),

@XmlEnumValue("AUTO-IPDHCPV-4")
AUTO_IPDHCPV_4("AUTO-IPDHCPV-4"),

@XmlEnumValue("DHCPV-4")
DHCPV_4("DHCPV-4"),

@XmlEnumValue("FIXED")
FIXED("FIXED");


    private final java.lang.String value;

    Ipv4AddressSourceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Ipv4AddressSourceEnumSimple fromValue(java.lang.String v) {
        for (Ipv4AddressSourceEnumSimple c: Ipv4AddressSourceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}