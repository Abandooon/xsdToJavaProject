package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE--SIMPLE")
@XmlEnum
public enum SwcToEcuMappingConstraintTypeSimple {

    
    @XmlEnumValue("DEDICATED")
    DEDICATED("DEDICATED"),;
    
    @XmlEnumValue("EXCLUSIVE")
    EXCLUSIVE("EXCLUSIVE");
    

    private final java.lang.String value;

    SwcToEcuMappingConstraintTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcToEcuMappingConstraintTypeSimple fromValue(java.lang.String v) {
        for (SwcToEcuMappingConstraintTypeSimple c: SwcToEcuMappingConstraintTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}