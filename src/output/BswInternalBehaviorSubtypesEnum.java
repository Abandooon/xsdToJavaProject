package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-INTERNAL-BEHAVIOR--SUBTYPES-ENUM")
@XmlEnum
public enum BswInternalBehaviorSubtypesEnum {

    
    @XmlEnumValue("BSW-INTERNAL-BEHAVIOR")
    BSW_INTERNAL_BEHAVIOR("BSW-INTERNAL-BEHAVIOR");
    

    private final java.lang.String value;

    BswInternalBehaviorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswInternalBehaviorSubtypesEnum fromValue(java.lang.String v) {
        for (BswInternalBehaviorSubtypesEnum c: BswInternalBehaviorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}