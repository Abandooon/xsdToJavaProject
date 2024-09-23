package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IPV-6-ADDRESS-SOURCE-ENUM--SIMPLE")
@XmlEnum
public enum Ipv6AddressSourceEnumSimple {

    
    @XmlEnumValue("DHCPV-6")
    DHCPV_6("DHCPV-6"),;
    
    @XmlEnumValue("FIXED")
    FIXED("FIXED"),;
    
    @XmlEnumValue("LINK-LOCAL")
    LINK_LOCAL("LINK-LOCAL"),;
    
    @XmlEnumValue("LINK-LOCAL--DOIP")
    LINK_LOCAL__DOIP("LINK-LOCAL--DOIP"),;
    
    @XmlEnumValue("ROUTER-ADVERTISEMENT")
    ROUTER_ADVERTISEMENT("ROUTER-ADVERTISEMENT");
    

    private final java.lang.String value;

    Ipv6AddressSourceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Ipv6AddressSourceEnumSimple fromValue(java.lang.String v) {
        for (Ipv6AddressSourceEnumSimple c: Ipv6AddressSourceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}