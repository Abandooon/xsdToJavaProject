package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NETWORK-ENDPOINT--SUBTYPES-ENUM")
@XmlEnum
public enum NetworkEndpointSubtypesEnum {

    
    @XmlEnumValue("NETWORK-ENDPOINT")
    NETWORK_ENDPOINT("NETWORK-ENDPOINT");
    

    private final java.lang.String value;

    NetworkEndpointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NetworkEndpointSubtypesEnum fromValue(java.lang.String v) {
        for (NetworkEndpointSubtypesEnum c: NetworkEndpointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}