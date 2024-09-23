package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-SIGNAL-I-PDU-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalIPduGroupSubtypesEnum {

    
    @XmlEnumValue("I-SIGNAL-I-PDU-GROUP")
    I_SIGNAL_I_PDU_GROUP("I-SIGNAL-I-PDU-GROUP");
    

    private final java.lang.String value;

    ISignalIPduGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalIPduGroupSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalIPduGroupSubtypesEnum c: ISignalIPduGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}