package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODE-DECLARATION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum ModeDeclarationGroupSubtypesEnum {

    
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE_DECLARATION_GROUP("MODE-DECLARATION-GROUP");
    

    private final java.lang.String value;

    ModeDeclarationGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeDeclarationGroupSubtypesEnum fromValue(java.lang.String v) {
        for (ModeDeclarationGroupSubtypesEnum c: ModeDeclarationGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}