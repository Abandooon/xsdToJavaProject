package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="REPORT-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum ReportBehaviorEnumSimple {

    
    @XmlEnumValue("REPORT-AFTER-INIT")
    REPORT_AFTER_INIT("REPORT-AFTER-INIT"),;
    
    @XmlEnumValue("REPORT-BEFORE-INIT")
    REPORT_BEFORE_INIT("REPORT-BEFORE-INIT");
    

    private final java.lang.String value;

    ReportBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ReportBehaviorEnumSimple fromValue(java.lang.String v) {
        for (ReportBehaviorEnumSimple c: ReportBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}