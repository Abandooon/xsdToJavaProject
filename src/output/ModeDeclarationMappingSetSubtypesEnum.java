package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODE-DECLARATION-MAPPING-SET--SUBTYPES-ENUM")
@XmlEnum
public enum ModeDeclarationMappingSetSubtypesEnum {

    
    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE_DECLARATION_MAPPING_SET("MODE-DECLARATION-MAPPING-SET");
    

    private final java.lang.String value;

    ModeDeclarationMappingSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeDeclarationMappingSetSubtypesEnum fromValue(java.lang.String v) {
        for (ModeDeclarationMappingSetSubtypesEnum c: ModeDeclarationMappingSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}