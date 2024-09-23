package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-BSW-MODE-DECLARATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventBswModeDeclarationTypeEnumSimple {

    
    @XmlEnumValue("MODE-DECLARATION-REQUESTED")
    MODE_DECLARATION_REQUESTED("MODE-DECLARATION-REQUESTED"),;
    
    @XmlEnumValue("MODE-DECLARATION-SWITCH-COMPLETED")
    MODE_DECLARATION_SWITCH_COMPLETED("MODE-DECLARATION-SWITCH-COMPLETED"),;
    
    @XmlEnumValue("MODE-DECLARATION-SWITCH-INITIATED")
    MODE_DECLARATION_SWITCH_INITIATED("MODE-DECLARATION-SWITCH-INITIATED");
    

    private final java.lang.String value;

    TdEventBswModeDeclarationTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventBswModeDeclarationTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventBswModeDeclarationTypeEnumSimple c: TdEventBswModeDeclarationTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}