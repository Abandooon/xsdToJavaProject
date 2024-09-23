package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NV-BLOCK-NEEDS-WRITING-PRIORITY-ENUM--SIMPLE")
@XmlEnum
public enum NvBlockNeedsWritingPriorityEnumSimple {

    
    @XmlEnumValue("HIGH")
    HIGH("HIGH"),;
    
    @XmlEnumValue("LOW")
    LOW("LOW"),;
    
    @XmlEnumValue("MEDIUM")
    MEDIUM("MEDIUM");
    

    private final java.lang.String value;

    NvBlockNeedsWritingPriorityEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NvBlockNeedsWritingPriorityEnumSimple fromValue(java.lang.String v) {
        for (NvBlockNeedsWritingPriorityEnumSimple c: NvBlockNeedsWritingPriorityEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}