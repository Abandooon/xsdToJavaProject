package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CLIENT-SERVER-OPERATION--SUBTYPES-ENUM")
@XmlEnum
public enum ClientServerOperationSubtypesEnum {

    
    @XmlEnumValue("CLIENT-SERVER-OPERATION")
    CLIENT_SERVER_OPERATION("CLIENT-SERVER-OPERATION");
    

    private final java.lang.String value;

    ClientServerOperationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ClientServerOperationSubtypesEnum fromValue(java.lang.String v) {
        for (ClientServerOperationSubtypesEnum c: ClientServerOperationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}