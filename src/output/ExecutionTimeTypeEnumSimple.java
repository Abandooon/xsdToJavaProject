package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EXECUTION-TIME-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ExecutionTimeTypeEnumSimple {

    
    @XmlEnumValue("GROSS")
    GROSS("GROSS"),;
    
    @XmlEnumValue("NET")
    NET("NET");
    

    private final java.lang.String value;

    ExecutionTimeTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExecutionTimeTypeEnumSimple fromValue(java.lang.String v) {
        for (ExecutionTimeTypeEnumSimple c: ExecutionTimeTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}