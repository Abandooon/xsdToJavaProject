package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="UDP-NM-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum UdpNmClusterSubtypesEnum {

    
    @XmlEnumValue("UDP-NM-CLUSTER")
    UDP_NM_CLUSTER("UDP-NM-CLUSTER");
    

    private final java.lang.String value;

    UdpNmClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static UdpNmClusterSubtypesEnum fromValue(java.lang.String v) {
        for (UdpNmClusterSubtypesEnum c: UdpNmClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}