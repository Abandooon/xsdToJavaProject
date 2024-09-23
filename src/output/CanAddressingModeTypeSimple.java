package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAN-ADDRESSING-MODE-TYPE--SIMPLE")
@XmlEnum
public enum CanAddressingModeTypeSimple {

    
    @XmlEnumValue("EXTENDED")
    EXTENDED("EXTENDED"),;
    
    @XmlEnumValue("STANDARD")
    STANDARD("STANDARD");
    

    private final java.lang.String value;

    CanAddressingModeTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanAddressingModeTypeSimple fromValue(java.lang.String v) {
        for (CanAddressingModeTypeSimple c: CanAddressingModeTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}