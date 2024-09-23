package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TIMING-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum TimingEventSubtypesEnum {

    
    @XmlEnumValue("TIMING-EVENT")
    TIMING_EVENT("TIMING-EVENT");
    

    private final java.lang.String value;

    TimingEventSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimingEventSubtypesEnum fromValue(java.lang.String v) {
        for (TimingEventSubtypesEnum c: TimingEventSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}