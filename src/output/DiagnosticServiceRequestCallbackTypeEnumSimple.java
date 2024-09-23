package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-SERVICE-REQUEST-CALLBACK-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticServiceRequestCallbackTypeEnumSimple {

    
    @XmlEnumValue("REQUEST-CALLBACK-TYPE-MANUFACTURER")
    REQUEST_CALLBACK_TYPE_MANUFACTURER("REQUEST-CALLBACK-TYPE-MANUFACTURER"),;
    
    @XmlEnumValue("REQUEST-CALLBACK-TYPE-SUPPLIER")
    REQUEST_CALLBACK_TYPE_SUPPLIER("REQUEST-CALLBACK-TYPE-SUPPLIER");
    

    private final java.lang.String value;

    DiagnosticServiceRequestCallbackTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticServiceRequestCallbackTypeEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticServiceRequestCallbackTypeEnumSimple c: DiagnosticServiceRequestCallbackTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}