package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CHAPTER-ENUM-BREAK--SIMPLE")
@XmlEnum
public enum ChapterEnumBreakSimple {

    
    @XmlEnumValue("BREAK")
    BREAK("BREAK"),;
    
    @XmlEnumValue("NO-BREAK")
    NO_BREAK("NO-BREAK");
    

    private final java.lang.String value;

    ChapterEnumBreakSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ChapterEnumBreakSimple fromValue(java.lang.String v) {
        for (ChapterEnumBreakSimple c: ChapterEnumBreakSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}