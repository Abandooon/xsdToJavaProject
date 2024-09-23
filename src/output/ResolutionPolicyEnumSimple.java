package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RESOLUTION-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum ResolutionPolicyEnumSimple {

    
    @XmlEnumValue("NO-SLOPPY")
    NO_SLOPPY("NO-SLOPPY"),;
    
    @XmlEnumValue("SLOPPY")
    SLOPPY("SLOPPY");
    

    private final java.lang.String value;

    ResolutionPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResolutionPolicyEnumSimple fromValue(java.lang.String v) {
        for (ResolutionPolicyEnumSimple c: ResolutionPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}