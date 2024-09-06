package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-QUERY--SUBTYPES-ENUM")
@XmlEnum
public enum EcucQuerySubtypesEnum {

    
    @XmlEnumValue("ECUC-QUERY")
    ECUC_QUERY("ECUC-QUERY");
    

    private final java.lang.String value;

    EcucQuerySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucQuerySubtypesEnum fromValue(java.lang.String v) {
        for (EcucQuerySubtypesEnum c: EcucQuerySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}