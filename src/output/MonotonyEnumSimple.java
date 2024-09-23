package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MONOTONY-ENUM--SIMPLE")
@XmlEnum
public enum MonotonyEnumSimple {

    
    @XmlEnumValue("DECREASING")
    DECREASING("DECREASING"),;
    
    @XmlEnumValue("INCREASING")
    INCREASING("INCREASING"),;
    
    @XmlEnumValue("MONOTONOUS")
    MONOTONOUS("MONOTONOUS"),;
    
    @XmlEnumValue("NO-MONOTONY")
    NO_MONOTONY("NO-MONOTONY"),;
    
    @XmlEnumValue("STRICT-MONOTONOUS")
    STRICT_MONOTONOUS("STRICT-MONOTONOUS"),;
    
    @XmlEnumValue("STRICTLY-DECREASING")
    STRICTLY_DECREASING("STRICTLY-DECREASING"),;
    
    @XmlEnumValue("STRICTLY-INCREASING")
    STRICTLY_INCREASING("STRICTLY-INCREASING");
    

    private final java.lang.String value;

    MonotonyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MonotonyEnumSimple fromValue(java.lang.String v) {
        for (MonotonyEnumSimple c: MonotonyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}