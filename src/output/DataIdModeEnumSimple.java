package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-ID-MODE-ENUM--SIMPLE")
@XmlEnum
public enum DataIdModeEnumSimple {

    
    @XmlEnumValue("ALL-16-BIT")
    ALL_16_BIT("ALL-16-BIT"),;
    
    @XmlEnumValue("ALTERNATING-8-BIT")
    ALTERNATING_8_BIT("ALTERNATING-8-BIT"),;
    
    @XmlEnumValue("LOWER-12-BIT")
    LOWER_12_BIT("LOWER-12-BIT"),;
    
    @XmlEnumValue("LOWER-8-BIT")
    LOWER_8_BIT("LOWER-8-BIT");
    

    private final java.lang.String value;

    DataIdModeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataIdModeEnumSimple fromValue(java.lang.String v) {
        for (DataIdModeEnumSimple c: DataIdModeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}