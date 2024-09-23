package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ETHERNET-COUPLING-PORT-SCHEDULER-ENUM--SIMPLE")
@XmlEnum
public enum EthernetCouplingPortSchedulerEnumSimple {

    
    @XmlEnumValue("DEFICIT-ROUND-ROBIN")
    DEFICIT_ROUND_ROBIN("DEFICIT-ROUND-ROBIN"),;
    
    @XmlEnumValue("STRICT-PRIORITY")
    STRICT_PRIORITY("STRICT-PRIORITY"),;
    
    @XmlEnumValue("WEIGHTED-ROUND-ROBIN")
    WEIGHTED_ROUND_ROBIN("WEIGHTED-ROUND-ROBIN");
    

    private final java.lang.String value;

    EthernetCouplingPortSchedulerEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetCouplingPortSchedulerEnumSimple fromValue(java.lang.String v) {
        for (EthernetCouplingPortSchedulerEnumSimple c: EthernetCouplingPortSchedulerEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}