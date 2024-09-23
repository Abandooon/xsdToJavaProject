package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GLOBAL-TIME-MASTER--SUBTYPES-ENUM")
@XmlEnum
public enum GlobalTimeMasterSubtypesEnum {

    
    @XmlEnumValue("GLOBAL-TIME-CAN-MASTER")
    GLOBAL_TIME_CAN_MASTER("GLOBAL-TIME-CAN-MASTER"),;
    
    @XmlEnumValue("GLOBAL-TIME-ETH-MASTER")
    GLOBAL_TIME_ETH_MASTER("GLOBAL-TIME-ETH-MASTER"),;
    
    @XmlEnumValue("GLOBAL-TIME-FR-MASTER")
    GLOBAL_TIME_FR_MASTER("GLOBAL-TIME-FR-MASTER"),;
    
    @XmlEnumValue("GLOBAL-TIME-MASTER")
    GLOBAL_TIME_MASTER("GLOBAL-TIME-MASTER");
    

    private final java.lang.String value;

    GlobalTimeMasterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GlobalTimeMasterSubtypesEnum fromValue(java.lang.String v) {
        for (GlobalTimeMasterSubtypesEnum c: GlobalTimeMasterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}