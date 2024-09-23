package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SO-AD-PROTOCOL-TYPE--SIMPLE")
@XmlEnum
public enum SoAdProtocolTypeSimple {

    
    @XmlEnumValue("TCP")
    TCP("TCP"),;
    
    @XmlEnumValue("UDP")
    UDP("UDP");
    

    private final java.lang.String value;

    SoAdProtocolTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SoAdProtocolTypeSimple fromValue(java.lang.String v) {
        for (SoAdProtocolTypeSimple c: SoAdProtocolTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}