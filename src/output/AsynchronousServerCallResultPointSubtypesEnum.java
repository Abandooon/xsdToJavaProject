package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum AsynchronousServerCallResultPointSubtypesEnum {

    
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    ASYNCHRONOUS_SERVER_CALL_RESULT_POINT("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT");
    

    private final java.lang.String value;

    AsynchronousServerCallResultPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AsynchronousServerCallResultPointSubtypesEnum fromValue(java.lang.String v) {
        for (AsynchronousServerCallResultPointSubtypesEnum c: AsynchronousServerCallResultPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}