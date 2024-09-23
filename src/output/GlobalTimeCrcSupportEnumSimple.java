package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GLOBAL-TIME-CRC-SUPPORT-ENUM--SIMPLE")
@XmlEnum
public enum GlobalTimeCrcSupportEnumSimple {

    
    @XmlEnumValue("CRC-NOT-SUPPORTED")
    CRC_NOT_SUPPORTED("CRC-NOT-SUPPORTED"),;
    
    @XmlEnumValue("CRC-SUPPORTED")
    CRC_SUPPORTED("CRC-SUPPORTED");
    

    private final java.lang.String value;

    GlobalTimeCrcSupportEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GlobalTimeCrcSupportEnumSimple fromValue(java.lang.String v) {
        for (GlobalTimeCrcSupportEnumSimple c: GlobalTimeCrcSupportEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}