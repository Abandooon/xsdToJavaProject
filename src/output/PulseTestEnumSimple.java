package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PULSE-TEST-ENUM--SIMPLE")
@XmlEnum
public enum PulseTestEnumSimple {

    
    @XmlEnumValue("DISABLE")
    DISABLE("DISABLE"),;
    
    @XmlEnumValue("ENABLE")
    ENABLE("ENABLE");
    

    private final java.lang.String value;

    PulseTestEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PulseTestEnumSimple fromValue(java.lang.String v) {
        for (PulseTestEnumSimple c: PulseTestEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}