package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-CALL-TYPE--SIMPLE")
@XmlEnum
public enum BswCallTypeSimple {

    
    @XmlEnumValue("CALLBACK")
    CALLBACK("CALLBACK"),;
    
    @XmlEnumValue("INTERRUPT")
    INTERRUPT("INTERRUPT"),;
    
    @XmlEnumValue("REGULAR")
    REGULAR("REGULAR"),;
    
    @XmlEnumValue("SCHEDULED")
    SCHEDULED("SCHEDULED");
    

    private final java.lang.String value;

    BswCallTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswCallTypeSimple fromValue(java.lang.String v) {
        for (BswCallTypeSimple c: BswCallTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}