package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TP-CONNECTION-IDENT--SUBTYPES-ENUM")
@XmlEnum
public enum TpConnectionIdentSubtypesEnum {

    
    @XmlEnumValue("TP-CONNECTION-IDENT")
    TP_CONNECTION_IDENT("TP-CONNECTION-IDENT");
    

    private final java.lang.String value;

    TpConnectionIdentSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TpConnectionIdentSubtypesEnum fromValue(java.lang.String v) {
        for (TpConnectionIdentSubtypesEnum c: TpConnectionIdentSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}