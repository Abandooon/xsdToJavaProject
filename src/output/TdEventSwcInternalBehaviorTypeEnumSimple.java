package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-SWC-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventSwcInternalBehaviorTypeEnumSimple {

    
    @XmlEnumValue("RUNNABLE-ENTITY-ACTIVATED")
    RUNNABLE_ENTITY_ACTIVATED("RUNNABLE-ENTITY-ACTIVATED"),;
    
    @XmlEnumValue("RUNNABLE-ENTITY-STARTED")
    RUNNABLE_ENTITY_STARTED("RUNNABLE-ENTITY-STARTED"),;
    
    @XmlEnumValue("RUNNABLE-ENTITY-TERMINATED")
    RUNNABLE_ENTITY_TERMINATED("RUNNABLE-ENTITY-TERMINATED"),;
    
    @XmlEnumValue("RUNNABLE-ENTITY-VARIABLE-ACCESS")
    RUNNABLE_ENTITY_VARIABLE_ACCESS("RUNNABLE-ENTITY-VARIABLE-ACCESS");
    

    private final java.lang.String value;

    TdEventSwcInternalBehaviorTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventSwcInternalBehaviorTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventSwcInternalBehaviorTypeEnumSimple c: TdEventSwcInternalBehaviorTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}