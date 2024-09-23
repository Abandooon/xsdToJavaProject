package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayNmClusterSubtypesEnum {

    
    @XmlEnumValue("FLEXRAY-NM-CLUSTER")
    FLEXRAY_NM_CLUSTER("FLEXRAY-NM-CLUSTER");
    

    private final java.lang.String value;

    FlexrayNmClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayNmClusterSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayNmClusterSubtypesEnum c: FlexrayNmClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}