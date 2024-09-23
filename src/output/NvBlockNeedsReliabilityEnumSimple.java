package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NV-BLOCK-NEEDS-RELIABILITY-ENUM--SIMPLE")
@XmlEnum
public enum NvBlockNeedsReliabilityEnumSimple {

    
    @XmlEnumValue("ERROR-CORRECTION")
    ERROR_CORRECTION("ERROR-CORRECTION"),;
    
    @XmlEnumValue("ERROR-DETECTION")
    ERROR_DETECTION("ERROR-DETECTION"),;
    
    @XmlEnumValue("NO-PROTECTION")
    NO_PROTECTION("NO-PROTECTION");
    

    private final java.lang.String value;

    NvBlockNeedsReliabilityEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NvBlockNeedsReliabilityEnumSimple fromValue(java.lang.String v) {
        for (NvBlockNeedsReliabilityEnumSimple c: NvBlockNeedsReliabilityEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}