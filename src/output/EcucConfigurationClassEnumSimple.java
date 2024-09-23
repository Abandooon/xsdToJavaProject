package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-CONFIGURATION-CLASS-ENUM--SIMPLE")
@XmlEnum
public enum EcucConfigurationClassEnumSimple {

    
    @XmlEnumValue("LINK")
    LINK("LINK"),;
    
    @XmlEnumValue("POST-BUILD")
    POST_BUILD("POST-BUILD"),;
    
    @XmlEnumValue("PRE-COMPILE")
    PRE_COMPILE("PRE-COMPILE"),;
    
    @XmlEnumValue("PUBLISHED-INFORMATION")
    PUBLISHED_INFORMATION("PUBLISHED-INFORMATION");
    

    private final java.lang.String value;

    EcucConfigurationClassEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucConfigurationClassEnumSimple fromValue(java.lang.String v) {
        for (EcucConfigurationClassEnumSimple c: EcucConfigurationClassEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}