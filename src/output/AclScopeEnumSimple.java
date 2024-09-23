package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ACL-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum AclScopeEnumSimple {

    
    @XmlEnumValue("DEPENDANT")
    DEPENDANT("DEPENDANT"),;
    
    @XmlEnumValue("DESCENDANT")
    DESCENDANT("DESCENDANT"),;
    
    @XmlEnumValue("EXPLICIT")
    EXPLICIT("EXPLICIT");
    

    private final java.lang.String value;

    AclScopeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AclScopeEnumSimple fromValue(java.lang.String v) {
        for (AclScopeEnumSimple c: AclScopeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}