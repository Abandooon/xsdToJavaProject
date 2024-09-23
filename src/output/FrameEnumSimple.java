package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FRAME-ENUM--SIMPLE")
@XmlEnum
public enum FrameEnumSimple {

    
    @XmlEnumValue("ALL")
    ALL("ALL"),;
    
    @XmlEnumValue("BOTTOM")
    BOTTOM("BOTTOM"),;
    
    @XmlEnumValue("NONE")
    NONE("NONE"),;
    
    @XmlEnumValue("SIDES")
    SIDES("SIDES"),;
    
    @XmlEnumValue("TOP")
    TOP("TOP"),;
    
    @XmlEnumValue("TOPBOT")
    TOPBOT("TOPBOT");
    

    private final java.lang.String value;

    FrameEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FrameEnumSimple fromValue(java.lang.String v) {
        for (FrameEnumSimple c: FrameEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}