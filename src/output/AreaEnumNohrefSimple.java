package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AREA-ENUM-NOHREF--SIMPLE")
@XmlEnum
public enum AreaEnumNohrefSimple {

    
    @XmlEnumValue("NOHREF")
    NOHREF("NOHREF");
    

    private final java.lang.String value;

    AreaEnumNohrefSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AreaEnumNohrefSimple fromValue(java.lang.String v) {
        for (AreaEnumNohrefSimple c: AreaEnumNohrefSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}