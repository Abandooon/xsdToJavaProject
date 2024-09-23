package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-AFFECTION-ENUM--SIMPLE")
@XmlEnum
public enum EcucAffectionEnumSimple {

    
    @XmlEnumValue("LT-AFFECTS-PB")
    LT_AFFECTS_PB("LT-AFFECTS-PB"),;
    
    @XmlEnumValue("NO-AFFECT")
    NO_AFFECT("NO-AFFECT"),;
    
    @XmlEnumValue("PC-AFFECTS-LT")
    PC_AFFECTS_LT("PC-AFFECTS-LT"),;
    
    @XmlEnumValue("PC-AFFECTS-LT-AND-PB")
    PC_AFFECTS_LT_AND_PB("PC-AFFECTS-LT-AND-PB"),;
    
    @XmlEnumValue("PC-AFFECTS-PB")
    PC_AFFECTS_PB("PC-AFFECTS-PB");
    

    private final java.lang.String value;

    EcucAffectionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucAffectionEnumSimple fromValue(java.lang.String v) {
        for (EcucAffectionEnumSimple c: EcucAffectionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}