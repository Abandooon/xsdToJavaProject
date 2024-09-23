package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ADDITIONAL-BINDING-TIME-ENUM--SIMPLE")
@XmlEnum
public enum AdditionalBindingTimeEnumSimple {

    
    @XmlEnumValue("BLUEPRINT-DERIVATION-TIME")
    BLUEPRINT_DERIVATION_TIME("BLUEPRINT-DERIVATION-TIME"),;
    
    @XmlEnumValue("POST-BUILD")
    POST_BUILD("POST-BUILD");
    

    private final java.lang.String value;

    AdditionalBindingTimeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AdditionalBindingTimeEnumSimple fromValue(java.lang.String v) {
        for (AdditionalBindingTimeEnumSimple c: AdditionalBindingTimeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}