package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EVENT-OCCURRENCE-KIND-ENUM--SIMPLE")
@XmlEnum
public enum EventOccurrenceKindEnumSimple {

    
    @XmlEnumValue("MULTIPLE-OCCURRENCES")
    MULTIPLE_OCCURRENCES("MULTIPLE-OCCURRENCES"),;
    
    @XmlEnumValue("SINGLE-OCCURRENCE")
    SINGLE_OCCURRENCE("SINGLE-OCCURRENCE");
    

    private final java.lang.String value;

    EventOccurrenceKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EventOccurrenceKindEnumSimple fromValue(java.lang.String v) {
        for (EventOccurrenceKindEnumSimple c: EventOccurrenceKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}