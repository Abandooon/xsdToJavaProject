package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MAXIMUM-MESSAGE-LENGTH-TYPE--SIMPLE")
@XmlEnum
public enum MaximumMessageLengthTypeSimple {

    
    @XmlEnumValue("I-4-G")
    I_4_G("I-4-G"),;
    
    @XmlEnumValue("ISO")
    ISO("ISO"),;
    
    @XmlEnumValue("ISO-6")
    ISO_6("ISO-6");
    

    private final java.lang.String value;

    MaximumMessageLengthTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MaximumMessageLengthTypeSimple fromValue(java.lang.String v) {
        for (MaximumMessageLengthTypeSimple c: MaximumMessageLengthTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}