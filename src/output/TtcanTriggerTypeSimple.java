package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TTCAN-TRIGGER-TYPE--SIMPLE")
@XmlEnum
public enum TtcanTriggerTypeSimple {

    
    @XmlEnumValue("RX-TRIGGER")
    RX_TRIGGER("RX-TRIGGER"),;
    
    @XmlEnumValue("TX-REF-TRIGGER")
    TX_REF_TRIGGER("TX-REF-TRIGGER"),;
    
    @XmlEnumValue("TX-REF-TRIGGER-GAP")
    TX_REF_TRIGGER_GAP("TX-REF-TRIGGER-GAP"),;
    
    @XmlEnumValue("TX-TRIGGER-MERGED")
    TX_TRIGGER_MERGED("TX-TRIGGER-MERGED"),;
    
    @XmlEnumValue("TX-TRIGGER-SINGLE")
    TX_TRIGGER_SINGLE("TX-TRIGGER-SINGLE"),;
    
    @XmlEnumValue("WATCH-TRIGGER")
    WATCH_TRIGGER("WATCH-TRIGGER"),;
    
    @XmlEnumValue("WATCH-TRIGGER-GAP")
    WATCH_TRIGGER_GAP("WATCH-TRIGGER-GAP");
    

    private final java.lang.String value;

    TtcanTriggerTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TtcanTriggerTypeSimple fromValue(java.lang.String v) {
        for (TtcanTriggerTypeSimple c: TtcanTriggerTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}