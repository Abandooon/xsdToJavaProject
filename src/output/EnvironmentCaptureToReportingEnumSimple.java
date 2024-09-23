package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ENVIRONMENT-CAPTURE-TO-REPORTING-ENUM--SIMPLE")
@XmlEnum
public enum EnvironmentCaptureToReportingEnumSimple {

    
    @XmlEnumValue("CAPTURE-ASYNCHRONOUS-TO-REPORTING")
    CAPTURE_ASYNCHRONOUS_TO_REPORTING("CAPTURE-ASYNCHRONOUS-TO-REPORTING"),;
    
    @XmlEnumValue("CAPTURE-SYNCHRONOUS-TO-REPORTING")
    CAPTURE_SYNCHRONOUS_TO_REPORTING("CAPTURE-SYNCHRONOUS-TO-REPORTING");
    

    private final java.lang.String value;

    EnvironmentCaptureToReportingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EnvironmentCaptureToReportingEnumSimple fromValue(java.lang.String v) {
        for (EnvironmentCaptureToReportingEnumSimple c: EnvironmentCaptureToReportingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}