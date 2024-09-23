package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GRAPHIC-NOTATION-ENUM--SIMPLE")
@XmlEnum
public enum GraphicNotationEnumSimple {

    
    @XmlEnumValue("BMP")
    BMP("BMP"),;
    
    @XmlEnumValue("EPS")
    EPS("EPS"),;
    
    @XmlEnumValue("GIF")
    GIF("GIF"),;
    
    @XmlEnumValue("JPG")
    JPG("JPG"),;
    
    @XmlEnumValue("PDF")
    PDF("PDF"),;
    
    @XmlEnumValue("PNG")
    PNG("PNG"),;
    
    @XmlEnumValue("SVG")
    SVG("SVG"),;
    
    @XmlEnumValue("TIFF")
    TIFF("TIFF");
    

    private final java.lang.String value;

    GraphicNotationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GraphicNotationEnumSimple fromValue(java.lang.String v) {
        for (GraphicNotationEnumSimple c: GraphicNotationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}