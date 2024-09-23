package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-SIGNAL--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalSubtypesEnum {

    
    @XmlEnumValue("I-SIGNAL")
    I_SIGNAL("I-SIGNAL");
    

    private final java.lang.String value;

    ISignalSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalSubtypesEnum c: ISignalSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}