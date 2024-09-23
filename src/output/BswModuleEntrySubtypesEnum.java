package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-MODULE-ENTRY--SUBTYPES-ENUM")
@XmlEnum
public enum BswModuleEntrySubtypesEnum {

    
    @XmlEnumValue("BSW-MODULE-ENTRY")
    BSW_MODULE_ENTRY("BSW-MODULE-ENTRY");
    

    private final java.lang.String value;

    BswModuleEntrySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswModuleEntrySubtypesEnum fromValue(java.lang.String v) {
        for (BswModuleEntrySubtypesEnum c: BswModuleEntrySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}