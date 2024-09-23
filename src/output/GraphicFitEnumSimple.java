package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GRAPHIC-FIT-ENUM--SIMPLE")
@XmlEnum
public enum GraphicFitEnumSimple {

    
    @XmlEnumValue("AS-IS")
    AS_IS("AS-IS"),;
    
    @XmlEnumValue("FIT-TO-PAGE")
    FIT_TO_PAGE("FIT-TO-PAGE"),;
    
    @XmlEnumValue("FIT-TO-TEXT")
    FIT_TO_TEXT("FIT-TO-TEXT"),;
    
    @XmlEnumValue("LIMIT-TO-PAGE")
    LIMIT_TO_PAGE("LIMIT-TO-PAGE"),;
    
    @XmlEnumValue("LIMIT-TO-TEXT")
    LIMIT_TO_TEXT("LIMIT-TO-TEXT"),;
    
    @XmlEnumValue("ROTATE-180")
    ROTATE_180("ROTATE-180"),;
    
    @XmlEnumValue("ROTATE-180-LIMIT-TO-TEXT")
    ROTATE_180_LIMIT_TO_TEXT("ROTATE-180-LIMIT-TO-TEXT"),;
    
    @XmlEnumValue("ROTATE-90-CCW")
    ROTATE_90_CCW("ROTATE-90-CCW"),;
    
    @XmlEnumValue("ROTATE-90-CCW-FIT-TO-TEXT")
    ROTATE_90_CCW_FIT_TO_TEXT("ROTATE-90-CCW-FIT-TO-TEXT"),;
    
    @XmlEnumValue("ROTATE-90-CCW-LIMIT-TO-TEXT")
    ROTATE_90_CCW_LIMIT_TO_TEXT("ROTATE-90-CCW-LIMIT-TO-TEXT"),;
    
    @XmlEnumValue("ROTATE-90-CW")
    ROTATE_90_CW("ROTATE-90-CW"),;
    
    @XmlEnumValue("ROTATE-90-CW-FIT-TO-TEXT")
    ROTATE_90_CW_FIT_TO_TEXT("ROTATE-90-CW-FIT-TO-TEXT"),;
    
    @XmlEnumValue("ROTATE-90-CW-LIMIT-TO-TEXT")
    ROTATE_90_CW_LIMIT_TO_TEXT("ROTATE-90-CW-LIMIT-TO-TEXT");
    

    private final java.lang.String value;

    GraphicFitEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GraphicFitEnumSimple fromValue(java.lang.String v) {
        for (GraphicFitEnumSimple c: GraphicFitEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}