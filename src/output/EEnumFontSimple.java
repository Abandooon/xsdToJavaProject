package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="E-ENUM-FONT--SIMPLE")
@XmlEnum
public enum EEnumFontSimple {

    
    @XmlEnumValue("DEFAULT")
    DEFAULT("DEFAULT"),;
    
    @XmlEnumValue("MONO")
    MONO("MONO");
    

    private final java.lang.String value;

    EEnumFontSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EEnumFontSimple fromValue(java.lang.String v) {
        for (EEnumFontSimple c: EEnumFontSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}