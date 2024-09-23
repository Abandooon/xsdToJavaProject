package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SDG-CAPTION--SUBTYPES-ENUM")
@XmlEnum
public enum SdgCaptionSubtypesEnum {

    
    @XmlEnumValue("SDG-CAPTION")
    SDG_CAPTION("SDG-CAPTION");
    

    private final java.lang.String value;

    SdgCaptionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SdgCaptionSubtypesEnum fromValue(java.lang.String v) {
        for (SdgCaptionSubtypesEnum c: SdgCaptionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}