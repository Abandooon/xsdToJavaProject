package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TIME-SYNC-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum TimeSyncTechnologyEnumSimple {

    
    @XmlEnumValue("AVB--IEEE-802--1-AS")
    AVB__IEEE_802__1_AS("AVB--IEEE-802--1-AS"),;
    
    @XmlEnumValue("NTP--RFC-958")
    NTP__RFC_958("NTP--RFC-958"),;
    
    @XmlEnumValue("PTP--IEEE-1588--2002")
    PTP__IEEE_1588__2002("PTP--IEEE-1588--2002"),;
    
    @XmlEnumValue("PTP--IEEE-1588--2008")
    PTP__IEEE_1588__2008("PTP--IEEE-1588--2008");
    

    private final java.lang.String value;

    TimeSyncTechnologyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimeSyncTechnologyEnumSimple fromValue(java.lang.String v) {
        for (TimeSyncTechnologyEnumSimple c: TimeSyncTechnologyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}