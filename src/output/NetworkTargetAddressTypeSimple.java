package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NETWORK-TARGET-ADDRESS-TYPE--SIMPLE")
@XmlEnum
public enum NetworkTargetAddressTypeSimple {

    
    @XmlEnumValue("FUNCTIONAL")
    FUNCTIONAL("FUNCTIONAL"),;
    
    @XmlEnumValue("FUNCTIONAL-CAN-FD")
    FUNCTIONAL_CAN_FD("FUNCTIONAL-CAN-FD"),;
    
    @XmlEnumValue("PHYSICAL")
    PHYSICAL("PHYSICAL"),;
    
    @XmlEnumValue("PHYSICAL-CAN-FD")
    PHYSICAL_CAN_FD("PHYSICAL-CAN-FD");
    

    private final java.lang.String value;

    NetworkTargetAddressTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NetworkTargetAddressTypeSimple fromValue(java.lang.String v) {
        for (NetworkTargetAddressTypeSimple c: NetworkTargetAddressTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}