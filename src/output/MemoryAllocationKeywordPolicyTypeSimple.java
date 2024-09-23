package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MEMORY-ALLOCATION-KEYWORD-POLICY-TYPE--SIMPLE")
@XmlEnum
public enum MemoryAllocationKeywordPolicyTypeSimple {

    
    @XmlEnumValue("ADDR-METHOD-SHORT-NAME")
    ADDR_METHOD_SHORT_NAME("ADDR-METHOD-SHORT-NAME"),;
    
    @XmlEnumValue("ADDR-METHOD-SHORT-NAME-AND-ALIGNMENT")
    ADDR_METHOD_SHORT_NAME_AND_ALIGNMENT("ADDR-METHOD-SHORT-NAME-AND-ALIGNMENT");
    

    private final java.lang.String value;

    MemoryAllocationKeywordPolicyTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MemoryAllocationKeywordPolicyTypeSimple fromValue(java.lang.String v) {
        for (MemoryAllocationKeywordPolicyTypeSimple c: MemoryAllocationKeywordPolicyTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}