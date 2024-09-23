package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM")
@XmlEnum
public enum GlobalTimeDomainSubtypesEnum {

    
    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL_TIME_DOMAIN("GLOBAL-TIME-DOMAIN");
    

    private final java.lang.String value;

    GlobalTimeDomainSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GlobalTimeDomainSubtypesEnum fromValue(java.lang.String v) {
        for (GlobalTimeDomainSubtypesEnum c: GlobalTimeDomainSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}