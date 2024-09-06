package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DEPENDENCY-USAGE-ENUM--SIMPLE")
@XmlEnum
public enum DependencyUsageEnumSimple {

    
    @XmlEnumValue("BUILD")
    BUILD("BUILD"),;
    
    @XmlEnumValue("CODEGENERATION")
    CODEGENERATION("CODEGENERATION"),;
    
    @XmlEnumValue("COMPILE")
    COMPILE("COMPILE"),;
    
    @XmlEnumValue("EXECUTE")
    EXECUTE("EXECUTE"),;
    
    @XmlEnumValue("LINK")
    LINK("LINK");
    

    private final java.lang.String value;

    DependencyUsageEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DependencyUsageEnumSimple fromValue(java.lang.String v) {
        for (DependencyUsageEnumSimple c: DependencyUsageEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}