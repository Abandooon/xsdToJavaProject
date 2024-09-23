package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MAPPING-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum MappingScopeEnumSimple {

    
    @XmlEnumValue("MAPPING-SCOPE-CORE")
    MAPPING_SCOPE_CORE("MAPPING-SCOPE-CORE"),;
    
    @XmlEnumValue("MAPPING-SCOPE-ECU")
    MAPPING_SCOPE_ECU("MAPPING-SCOPE-ECU"),;
    
    @XmlEnumValue("MAPPING-SCOPE-PARTITION")
    MAPPING_SCOPE_PARTITION("MAPPING-SCOPE-PARTITION");
    

    private final java.lang.String value;

    MappingScopeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MappingScopeEnumSimple fromValue(java.lang.String v) {
        for (MappingScopeEnumSimple c: MappingScopeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}