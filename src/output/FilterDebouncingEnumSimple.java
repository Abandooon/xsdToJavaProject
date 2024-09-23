package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FILTER-DEBOUNCING-ENUM--SIMPLE")
@XmlEnum
public enum FilterDebouncingEnumSimple {

    
    @XmlEnumValue("DEBOUNCE-DATA")
    DEBOUNCE_DATA("DEBOUNCE-DATA"),;
    
    @XmlEnumValue("RAW-DATA")
    RAW_DATA("RAW-DATA"),;
    
    @XmlEnumValue("WAIT-TIME-DATE")
    WAIT_TIME_DATE("WAIT-TIME-DATE");
    

    private final java.lang.String value;

    FilterDebouncingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FilterDebouncingEnumSimple fromValue(java.lang.String v) {
        for (FilterDebouncingEnumSimple c: FilterDebouncingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}