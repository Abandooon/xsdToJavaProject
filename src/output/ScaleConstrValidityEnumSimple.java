package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SCALE-CONSTR-VALIDITY-ENUM--SIMPLE")
@XmlEnum
public enum ScaleConstrValidityEnumSimple {

    
    @XmlEnumValue("NOT-AVAILABLE")
    NOT_AVAILABLE("NOT-AVAILABLE"),;
    
    @XmlEnumValue("NOT-DEFINED")
    NOT_DEFINED("NOT-DEFINED"),;
    
    @XmlEnumValue("NOT-VALID")
    NOT_VALID("NOT-VALID"),;
    
    @XmlEnumValue("VALID")
    VALID("VALID");
    

    private final java.lang.String value;

    ScaleConstrValidityEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ScaleConstrValidityEnumSimple fromValue(java.lang.String v) {
        for (ScaleConstrValidityEnumSimple c: ScaleConstrValidityEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}