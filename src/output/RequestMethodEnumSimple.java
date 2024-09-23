package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="REQUEST-METHOD-ENUM--SIMPLE")
@XmlEnum
public enum RequestMethodEnumSimple {

    
    @XmlEnumValue("CONNECT")
    CONNECT("CONNECT"),;
    
    @XmlEnumValue("DELETE")
    DELETE("DELETE"),;
    
    @XmlEnumValue("GET")
    GET("GET"),;
    
    @XmlEnumValue("HEAD")
    HEAD("HEAD"),;
    
    @XmlEnumValue("OPTIONS")
    OPTIONS("OPTIONS"),;
    
    @XmlEnumValue("POST")
    POST("POST"),;
    
    @XmlEnumValue("PUT")
    PUT("PUT"),;
    
    @XmlEnumValue("TRACE")
    TRACE("TRACE");
    

    private final java.lang.String value;

    RequestMethodEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RequestMethodEnumSimple fromValue(java.lang.String v) {
        for (RequestMethodEnumSimple c: RequestMethodEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}