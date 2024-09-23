package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ALIGN-ENUM--SIMPLE")
@XmlEnum
public enum AlignEnumSimple {

    
    @XmlEnumValue("CENTER")
    CENTER("CENTER"),;
    
    @XmlEnumValue("JUSTIFY")
    JUSTIFY("JUSTIFY"),;
    
    @XmlEnumValue("LEFT")
    LEFT("LEFT"),;
    
    @XmlEnumValue("RIGHT")
    RIGHT("RIGHT");
    

    private final java.lang.String value;

    AlignEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AlignEnumSimple fromValue(java.lang.String v) {
        for (AlignEnumSimple c: AlignEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}