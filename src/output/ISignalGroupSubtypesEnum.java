package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-SIGNAL-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalGroupSubtypesEnum {

    
    @XmlEnumValue("I-SIGNAL-GROUP")
    I_SIGNAL_GROUP("I-SIGNAL-GROUP");
    

    private final java.lang.String value;

    ISignalGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalGroupSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalGroupSubtypesEnum c: ISignalGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}