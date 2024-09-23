package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COUPLING-ELEMENT-ENUM--SIMPLE")
@XmlEnum
public enum CouplingElementEnumSimple {

    
    @XmlEnumValue("HUB")
    HUB("HUB"),;
    
    @XmlEnumValue("ROUTER")
    ROUTER("ROUTER"),;
    
    @XmlEnumValue("SWITCH")
    SWITCH("SWITCH");
    

    private final java.lang.String value;

    CouplingElementEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CouplingElementEnumSimple fromValue(java.lang.String v) {
        for (CouplingElementEnumSimple c: CouplingElementEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}