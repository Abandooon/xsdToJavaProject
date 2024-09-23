package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ETHERNET-SWITCH-VLAN-EGRESS-TAGGING-ENUM--SIMPLE")
@XmlEnum
public enum EthernetSwitchVlanEgressTaggingEnumSimple {

    
    @XmlEnumValue("NOT-SENT")
    NOT_SENT("NOT-SENT"),;
    
    @XmlEnumValue("SENT-TAGGED")
    SENT_TAGGED("SENT-TAGGED"),;
    
    @XmlEnumValue("SENT-UNTAGGED")
    SENT_UNTAGGED("SENT-UNTAGGED");
    

    private final java.lang.String value;

    EthernetSwitchVlanEgressTaggingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetSwitchVlanEgressTaggingEnumSimple fromValue(java.lang.String v) {
        for (EthernetSwitchVlanEgressTaggingEnumSimple c: EthernetSwitchVlanEgressTaggingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}