package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLEXRAY-PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayPhysicalChannelSubtypesEnum {

    
    @XmlEnumValue("FLEXRAY-PHYSICAL-CHANNEL")
    FLEXRAY_PHYSICAL_CHANNEL("FLEXRAY-PHYSICAL-CHANNEL");
    

    private final java.lang.String value;

    FlexrayPhysicalChannelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayPhysicalChannelSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayPhysicalChannelSubtypesEnum c: FlexrayPhysicalChannelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}