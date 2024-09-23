package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAN-TP-ADDRESSING-FORMAT-TYPE--SIMPLE")
@XmlEnum
public enum CanTpAddressingFormatTypeSimple {

    
    @XmlEnumValue("EXTENDED")
    EXTENDED("EXTENDED"),;
    
    @XmlEnumValue("MIXED")
    MIXED("MIXED"),;
    
    @XmlEnumValue("MIXED-29-BIT")
    MIXED_29_BIT("MIXED-29-BIT"),;
    
    @XmlEnumValue("NORMALFIXED")
    NORMALFIXED("NORMALFIXED"),;
    
    @XmlEnumValue("STANDARD")
    STANDARD("STANDARD");
    

    private final java.lang.String value;

    CanTpAddressingFormatTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanTpAddressingFormatTypeSimple fromValue(java.lang.String v) {
        for (CanTpAddressingFormatTypeSimple c: CanTpAddressingFormatTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}