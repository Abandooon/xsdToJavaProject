package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM")
@XmlEnum
public enum ClientIdDefinitionSetSubtypesEnum {

    
    @XmlEnumValue("CLIENT-ID-DEFINITION-SET")
    CLIENT_ID_DEFINITION_SET("CLIENT-ID-DEFINITION-SET");
    

    private final java.lang.String value;

    ClientIdDefinitionSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ClientIdDefinitionSetSubtypesEnum fromValue(java.lang.String v) {
        for (ClientIdDefinitionSetSubtypesEnum c: ClientIdDefinitionSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}