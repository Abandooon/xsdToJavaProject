package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LIN-FRAME-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum LinFrameTriggeringSubtypesEnum {

    
    @XmlEnumValue("LIN-FRAME-TRIGGERING")
    LIN_FRAME_TRIGGERING("LIN-FRAME-TRIGGERING");
    

    private final java.lang.String value;

    LinFrameTriggeringSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinFrameTriggeringSubtypesEnum fromValue(java.lang.String v) {
        for (LinFrameTriggeringSubtypesEnum c: LinFrameTriggeringSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}