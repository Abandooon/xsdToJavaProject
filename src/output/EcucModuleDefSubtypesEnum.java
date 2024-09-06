package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-MODULE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucModuleDefSubtypesEnum {

    
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC_MODULE_DEF("ECUC-MODULE-DEF");
    

    private final java.lang.String value;

    EcucModuleDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucModuleDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucModuleDefSubtypesEnum c: EcucModuleDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}