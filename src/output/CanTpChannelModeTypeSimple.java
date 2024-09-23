package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAN-TP-CHANNEL-MODE-TYPE--SIMPLE")
@XmlEnum
public enum CanTpChannelModeTypeSimple {

    
    @XmlEnumValue("FULL-DUPLEX-MODE")
    FULL_DUPLEX_MODE("FULL-DUPLEX-MODE"),;
    
    @XmlEnumValue("HALF-DUPLEX-MODE")
    HALF_DUPLEX_MODE("HALF-DUPLEX-MODE");
    

    private final java.lang.String value;

    CanTpChannelModeTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanTpChannelModeTypeSimple fromValue(java.lang.String v) {
        for (CanTpChannelModeTypeSimple c: CanTpChannelModeTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}