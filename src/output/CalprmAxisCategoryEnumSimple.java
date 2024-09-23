package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CALPRM-AXIS-CATEGORY-ENUM--SIMPLE")
@XmlEnum
public enum CalprmAxisCategoryEnumSimple {

    
    @XmlEnumValue("COM-AXIS")
    COM_AXIS("COM-AXIS"),;
    
    @XmlEnumValue("COM_AXIS")
    COM_AXIS("COM_AXIS"),;
    
    @XmlEnumValue("CURVE-AXIS")
    CURVE_AXIS("CURVE-AXIS"),;
    
    @XmlEnumValue("CURVE_AXIS")
    CURVE_AXIS("CURVE_AXIS"),;
    
    @XmlEnumValue("FIX-AXIS")
    FIX_AXIS("FIX-AXIS"),;
    
    @XmlEnumValue("FIX_AXIS")
    FIX_AXIS("FIX_AXIS"),;
    
    @XmlEnumValue("RES-AXIS")
    RES_AXIS("RES-AXIS"),;
    
    @XmlEnumValue("RES_AXIS")
    RES_AXIS("RES_AXIS"),;
    
    @XmlEnumValue("STD-AXIS")
    STD_AXIS("STD-AXIS"),;
    
    @XmlEnumValue("STD_AXIS")
    STD_AXIS("STD_AXIS");
    

    private final java.lang.String value;

    CalprmAxisCategoryEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CalprmAxisCategoryEnumSimple fromValue(java.lang.String v) {
        for (CalprmAxisCategoryEnumSimple c: CalprmAxisCategoryEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}