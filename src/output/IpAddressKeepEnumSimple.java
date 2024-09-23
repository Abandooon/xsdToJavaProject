package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IP-ADDRESS-KEEP-ENUM--SIMPLE")
@XmlEnum
public enum IpAddressKeepEnumSimple {

    
    @XmlEnumValue("FORGET")
    FORGET("FORGET"),;
    
    @XmlEnumValue("STORE-PERSISTENTLY")
    STORE_PERSISTENTLY("STORE-PERSISTENTLY");
    

    private final java.lang.String value;

    IpAddressKeepEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IpAddressKeepEnumSimple fromValue(java.lang.String v) {
        for (IpAddressKeepEnumSimple c: IpAddressKeepEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}