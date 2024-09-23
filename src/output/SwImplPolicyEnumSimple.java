package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SW-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SwImplPolicyEnumSimple {

    
    @XmlEnumValue("CONST")
    CONST("CONST"),;
    
    @XmlEnumValue("FIXED")
    FIXED("FIXED"),;
    
    @XmlEnumValue("MEASUREMENT-POINT")
    MEASUREMENT_POINT("MEASUREMENT-POINT"),;
    
    @XmlEnumValue("QUEUED")
    QUEUED("QUEUED"),;
    
    @XmlEnumValue("STANDARD")
    STANDARD("STANDARD");
    

    private final java.lang.String value;

    SwImplPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwImplPolicyEnumSimple fromValue(java.lang.String v) {
        for (SwImplPolicyEnumSimple c: SwImplPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}