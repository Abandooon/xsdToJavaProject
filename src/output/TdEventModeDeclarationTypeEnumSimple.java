package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-MODE-DECLARATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventModeDeclarationTypeEnumSimple {

    
    @XmlEnumValue("MODE-DECLARATION-SWITCH-COMPLETED")
    MODE_DECLARATION_SWITCH_COMPLETED("MODE-DECLARATION-SWITCH-COMPLETED"),;
    
    @XmlEnumValue("MODE-DECLARATION-SWITCH-INITIATED")
    MODE_DECLARATION_SWITCH_INITIATED("MODE-DECLARATION-SWITCH-INITIATED");
    

    private final java.lang.String value;

    TdEventModeDeclarationTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventModeDeclarationTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventModeDeclarationTypeEnumSimple c: TdEventModeDeclarationTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}