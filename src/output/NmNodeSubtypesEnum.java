package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NM-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum NmNodeSubtypesEnum {

    
    @XmlEnumValue("CAN-NM-NODE")
    CAN_NM_NODE("CAN-NM-NODE"),;
    
    @XmlEnumValue("FLEXRAY-NM-NODE")
    FLEXRAY_NM_NODE("FLEXRAY-NM-NODE"),;
    
    @XmlEnumValue("J-1939-NM-NODE")
    J_1939_NM_NODE("J-1939-NM-NODE"),;
    
    @XmlEnumValue("NM-NODE")
    NM_NODE("NM-NODE"),;
    
    @XmlEnumValue("UDP-NM-NODE")
    UDP_NM_NODE("UDP-NM-NODE");
    

    private final java.lang.String value;

    NmNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NmNodeSubtypesEnum fromValue(java.lang.String v) {
        for (NmNodeSubtypesEnum c: NmNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}