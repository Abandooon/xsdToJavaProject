package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-ACCESS-PERMISSION-VALIDITY-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticAccessPermissionValidityEnumSimple {

    
    @XmlEnumValue("ACCES-PERRMISSION-SERVICE-CLASS")
    ACCES_PERRMISSION_SERVICE_CLASS("ACCES-PERRMISSION-SERVICE-CLASS"),;
    
    @XmlEnumValue("ACCESS-PERMISSION-INSTANCE-OVERRIDES-CLASS")
    ACCESS_PERMISSION_INSTANCE_OVERRIDES_CLASS("ACCESS-PERMISSION-INSTANCE-OVERRIDES-CLASS"),;
    
    @XmlEnumValue("ACCESS-PERMISSION-SERVICE-CLASS")
    ACCESS_PERMISSION_SERVICE_CLASS("ACCESS-PERMISSION-SERVICE-CLASS"),;
    
    @XmlEnumValue("ACCESS-PERMISSION-SERVICE-INSTANCE")
    ACCESS_PERMISSION_SERVICE_INSTANCE("ACCESS-PERMISSION-SERVICE-INSTANCE");
    

    private final java.lang.String value;

    DiagnosticAccessPermissionValidityEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticAccessPermissionValidityEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticAccessPermissionValidityEnumSimple c: DiagnosticAccessPermissionValidityEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}