package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FM-FEATURE-SELECTION-SET--SUBTYPES-ENUM")
@XmlEnum
public enum FmFeatureSelectionSetSubtypesEnum {

    
    @XmlEnumValue("FM-FEATURE-SELECTION-SET")
    FM_FEATURE_SELECTION_SET("FM-FEATURE-SELECTION-SET");
    

    private final java.lang.String value;

    FmFeatureSelectionSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FmFeatureSelectionSetSubtypesEnum fromValue(java.lang.String v) {
        for (FmFeatureSelectionSetSubtypesEnum c: FmFeatureSelectionSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}