package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RAM-BLOCK-STATUS-CONTROL-ENUM--SIMPLE")
@XmlEnum
public enum RamBlockStatusControlEnumSimple {

    
    @XmlEnumValue("API")
    API("API"),;
    
    @XmlEnumValue("NV-RAM-MANAGER")
    NV_RAM_MANAGER("NV-RAM-MANAGER");
    

    private final java.lang.String value;

    RamBlockStatusControlEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RamBlockStatusControlEnumSimple fromValue(java.lang.String v) {
        for (RamBlockStatusControlEnumSimple c: RamBlockStatusControlEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}