package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="VALIGN-ENUM--SIMPLE")
@XmlEnum
public enum ValignEnumSimple {

    
    @XmlEnumValue("BOTTOM")
    BOTTOM("BOTTOM"),;
    
    @XmlEnumValue("MIDDLE")
    MIDDLE("MIDDLE"),;
    
    @XmlEnumValue("TOP")
    TOP("TOP");
    

    private final java.lang.String value;

    ValignEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ValignEnumSimple fromValue(java.lang.String v) {
        for (ValignEnumSimple c: ValignEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}