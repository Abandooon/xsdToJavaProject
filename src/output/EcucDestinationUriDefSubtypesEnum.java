package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucDestinationUriDefSubtypesEnum {

    
    @XmlEnumValue("ECUC-DESTINATION-URI-DEF")
    ECUC_DESTINATION_URI_DEF("ECUC-DESTINATION-URI-DEF");
    

    private final java.lang.String value;

    EcucDestinationUriDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucDestinationUriDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucDestinationUriDefSubtypesEnum c: EcucDestinationUriDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}