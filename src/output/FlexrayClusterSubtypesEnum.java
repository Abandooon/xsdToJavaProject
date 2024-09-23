package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLEXRAY-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayClusterSubtypesEnum {

    
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY_CLUSTER("FLEXRAY-CLUSTER");
    

    private final java.lang.String value;

    FlexrayClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayClusterSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayClusterSubtypesEnum c: FlexrayClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}