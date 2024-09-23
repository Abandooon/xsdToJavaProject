package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PREDEFINED-VARIANT--SUBTYPES-ENUM")
@XmlEnum
public enum PredefinedVariantSubtypesEnum {

    
    @XmlEnumValue("PREDEFINED-VARIANT")
    PREDEFINED_VARIANT("PREDEFINED-VARIANT");
    

    private final java.lang.String value;

    PredefinedVariantSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PredefinedVariantSubtypesEnum fromValue(java.lang.String v) {
        for (PredefinedVariantSubtypesEnum c: PredefinedVariantSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}