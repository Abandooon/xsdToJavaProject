package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AR-PACKAGE--SUBTYPES-ENUM")
@XmlEnum
public enum ArPackageSubtypesEnum {

    
    @XmlEnumValue("AR-PACKAGE")
    AR_PACKAGE("AR-PACKAGE");
    

    private final java.lang.String value;

    ArPackageSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArPackageSubtypesEnum fromValue(java.lang.String v) {
        for (ArPackageSubtypesEnum c: ArPackageSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}