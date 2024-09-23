package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BINDING-TIME-ENUM--SIMPLE")
@XmlEnum
public enum BindingTimeEnumSimple {

    
    @XmlEnumValue("CODE-GENERATION-TIME")
    CODE_GENERATION_TIME("CODE-GENERATION-TIME"),;
    
    @XmlEnumValue("LINK-TIME")
    LINK_TIME("LINK-TIME"),;
    
    @XmlEnumValue("PRE-COMPILE-TIME")
    PRE_COMPILE_TIME("PRE-COMPILE-TIME"),;
    
    @XmlEnumValue("SYSTEM-DESIGN-TIME")
    SYSTEM_DESIGN_TIME("SYSTEM-DESIGN-TIME");
    

    private final java.lang.String value;

    BindingTimeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BindingTimeEnumSimple fromValue(java.lang.String v) {
        for (BindingTimeEnumSimple c: BindingTimeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}