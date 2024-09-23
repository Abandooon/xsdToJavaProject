package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ModeDeclarationGroupPrototypeSubtypesEnum {

    
    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE_DECLARATION_GROUP_PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE");
    

    private final java.lang.String value;

    ModeDeclarationGroupPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeDeclarationGroupPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (ModeDeclarationGroupPrototypeSubtypesEnum c: ModeDeclarationGroupPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}