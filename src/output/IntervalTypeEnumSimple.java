package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="INTERVAL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum IntervalTypeEnumSimple {

    
    @XmlEnumValue("CLOSED")
    CLOSED("CLOSED"),;
    
    @XmlEnumValue("INFINITE")
    INFINITE("INFINITE"),;
    
    @XmlEnumValue("OPEN")
    OPEN("OPEN");
    

    private final java.lang.String value;

    IntervalTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IntervalTypeEnumSimple fromValue(java.lang.String v) {
        for (IntervalTypeEnumSimple c: IntervalTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}