package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-SIGNAL-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalTriggeringSubtypesEnum {

    
    @XmlEnumValue("I-SIGNAL-TRIGGERING")
    I_SIGNAL_TRIGGERING("I-SIGNAL-TRIGGERING");
    

    private final java.lang.String value;

    ISignalTriggeringSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalTriggeringSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalTriggeringSubtypesEnum c: ISignalTriggeringSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}