package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AREA-ENUM-SHAPE--SIMPLE")
@XmlEnum
public enum AreaEnumShapeSimple {

    
    @XmlEnumValue("CIRCLE")
    CIRCLE("CIRCLE"),;
    
    @XmlEnumValue("DEFAULT")
    DEFAULT("DEFAULT"),;
    
    @XmlEnumValue("POLY")
    POLY("POLY"),;
    
    @XmlEnumValue("RECT")
    RECT("RECT");
    

    private final java.lang.String value;

    AreaEnumShapeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AreaEnumShapeSimple fromValue(java.lang.String v) {
        for (AreaEnumShapeSimple c: AreaEnumShapeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}