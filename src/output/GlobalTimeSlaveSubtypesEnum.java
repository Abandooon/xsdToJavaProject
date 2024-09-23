package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GLOBAL-TIME-SLAVE--SUBTYPES-ENUM")
@XmlEnum
public enum GlobalTimeSlaveSubtypesEnum {

    
    @XmlEnumValue("GLOBAL-TIME-CAN-SLAVE")
    GLOBAL_TIME_CAN_SLAVE("GLOBAL-TIME-CAN-SLAVE"),;
    
    @XmlEnumValue("GLOBAL-TIME-ETH-SLAVE")
    GLOBAL_TIME_ETH_SLAVE("GLOBAL-TIME-ETH-SLAVE"),;
    
    @XmlEnumValue("GLOBAL-TIME-FR-SLAVE")
    GLOBAL_TIME_FR_SLAVE("GLOBAL-TIME-FR-SLAVE"),;
    
    @XmlEnumValue("GLOBAL-TIME-SLAVE")
    GLOBAL_TIME_SLAVE("GLOBAL-TIME-SLAVE");
    

    private final java.lang.String value;

    GlobalTimeSlaveSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GlobalTimeSlaveSubtypesEnum fromValue(java.lang.String v) {
        for (GlobalTimeSlaveSubtypesEnum c: GlobalTimeSlaveSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}