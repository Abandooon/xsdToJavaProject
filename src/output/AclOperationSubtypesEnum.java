package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ACL-OPERATION--SUBTYPES-ENUM")
@XmlEnum
public enum AclOperationSubtypesEnum {

    
    @XmlEnumValue("ACL-OPERATION")
    ACL_OPERATION("ACL-OPERATION");
    

    private final java.lang.String value;

    AclOperationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AclOperationSubtypesEnum fromValue(java.lang.String v) {
        for (AclOperationSubtypesEnum c: AclOperationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}