package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="OBD-RATIO-CONNECTION-KIND-ENUM--SIMPLE")
@XmlEnum
public enum ObdRatioConnectionKindEnumSimple {

    
    @XmlEnumValue("API-USE")
    API_USE("API-USE"),;
    
    @XmlEnumValue("OBSERVER")
    OBSERVER("OBSERVER");
    

    private final java.lang.String value;

    ObdRatioConnectionKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ObdRatioConnectionKindEnumSimple fromValue(java.lang.String v) {
        for (ObdRatioConnectionKindEnumSimple c: ObdRatioConnectionKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}