package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MAC-MULTICAST-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum MacMulticastGroupSubtypesEnum {

    
    @XmlEnumValue("MAC-MULTICAST-GROUP")
    MAC_MULTICAST_GROUP("MAC-MULTICAST-GROUP");
    

    private final java.lang.String value;

    MacMulticastGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MacMulticastGroupSubtypesEnum fromValue(java.lang.String v) {
        for (MacMulticastGroupSubtypesEnum c: MacMulticastGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}