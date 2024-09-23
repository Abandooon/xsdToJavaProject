package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-LIMIT-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DataLimitKindEnumSimple {

    
    @XmlEnumValue("MAX")
    MAX("MAX"),;
    
    @XmlEnumValue("MIN")
    MIN("MIN"),;
    
    @XmlEnumValue("NONE")
    NONE("NONE");
    

    private final java.lang.String value;

    DataLimitKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataLimitKindEnumSimple fromValue(java.lang.String v) {
        for (DataLimitKindEnumSimple c: DataLimitKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}