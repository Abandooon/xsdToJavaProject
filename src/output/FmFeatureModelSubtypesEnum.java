package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FM-FEATURE-MODEL--SUBTYPES-ENUM")
@XmlEnum
public enum FmFeatureModelSubtypesEnum {

    
    @XmlEnumValue("FM-FEATURE-MODEL")
    FM_FEATURE_MODEL("FM-FEATURE-MODEL");
    

    private final java.lang.String value;

    FmFeatureModelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FmFeatureModelSubtypesEnum fromValue(java.lang.String v) {
        for (FmFeatureModelSubtypesEnum c: FmFeatureModelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}