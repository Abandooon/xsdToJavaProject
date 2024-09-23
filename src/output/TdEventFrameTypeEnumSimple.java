package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-FRAME-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventFrameTypeEnumSimple {

    
    @XmlEnumValue("FRAME-QUEUED-FOR-TRANSMISSION")
    FRAME_QUEUED_FOR_TRANSMISSION("FRAME-QUEUED-FOR-TRANSMISSION"),;
    
    @XmlEnumValue("FRAME-RECEIVED-BY-IF")
    FRAME_RECEIVED_BY_IF("FRAME-RECEIVED-BY-IF"),;
    
    @XmlEnumValue("FRAME-TRANSMITTED-ON-BUS")
    FRAME_TRANSMITTED_ON_BUS("FRAME-TRANSMITTED-ON-BUS");
    

    private final java.lang.String value;

    TdEventFrameTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventFrameTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventFrameTypeEnumSimple c: TdEventFrameTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}