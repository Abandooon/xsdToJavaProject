package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-MODULE-DESCRIPTION--SUBTYPES-ENUM")
@XmlEnum
public enum BswModuleDescriptionSubtypesEnum {

    
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW_MODULE_DESCRIPTION("BSW-MODULE-DESCRIPTION");
    

    private final java.lang.String value;

    BswModuleDescriptionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswModuleDescriptionSubtypesEnum fromValue(java.lang.String v) {
        for (BswModuleDescriptionSubtypesEnum c: BswModuleDescriptionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}