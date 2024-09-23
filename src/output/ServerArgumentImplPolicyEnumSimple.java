package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SERVER-ARGUMENT-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum ServerArgumentImplPolicyEnumSimple {

    
    @XmlEnumValue("USE-ARGUMENT-TYPE")
    USE_ARGUMENT_TYPE("USE-ARGUMENT-TYPE"),;
    
    @XmlEnumValue("USE-ARRAY-BASE-TYPE")
    USE_ARRAY_BASE_TYPE("USE-ARRAY-BASE-TYPE"),;
    
    @XmlEnumValue("USE-VOID")
    USE_VOID("USE-VOID");
    

    private final java.lang.String value;

    ServerArgumentImplPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ServerArgumentImplPolicyEnumSimple fromValue(java.lang.String v) {
        for (ServerArgumentImplPolicyEnumSimple c: ServerArgumentImplPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}