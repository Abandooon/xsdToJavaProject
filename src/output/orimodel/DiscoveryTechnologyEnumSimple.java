package stdgui.data.model.orimodel;

@XmlType(name="DISCOVERY-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum DiscoveryTechnologyEnumSimple {

@XmlEnumValue("BONJOUR")
BONJOUR("BONJOUR"),

@XmlEnumValue("DLNA")
DLNA("DLNA"),

@XmlEnumValue("SLP")
SLP("SLP"),

@XmlEnumValue("SOMEIP")
SOMEIP("SOMEIP"),

@XmlEnumValue("SSDP")
SSDP("SSDP");


    private final java.lang.String value;

    DiscoveryTechnologyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiscoveryTechnologyEnumSimple fromValue(java.lang.String v) {
        for (DiscoveryTechnologyEnumSimple c: DiscoveryTechnologyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}