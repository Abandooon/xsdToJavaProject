package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ORIENT-ENUM--SIMPLE")
@XmlEnum
public enum OrientEnumSimple {

    
    @XmlEnumValue("LAND")
    LAND("LAND"),;
    
    @XmlEnumValue("PORT")
    PORT("PORT");
    

    private final java.lang.String value;

    OrientEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static OrientEnumSimple fromValue(java.lang.String v) {
        for (OrientEnumSimple c: OrientEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}