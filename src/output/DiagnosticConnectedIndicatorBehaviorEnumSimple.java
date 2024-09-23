package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-CONNECTED-INDICATOR-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticConnectedIndicatorBehaviorEnumSimple {

    
    @XmlEnumValue("BLINK-MODE")
    BLINK_MODE("BLINK-MODE"),;
    
    @XmlEnumValue("BLINK-OR-CONTINUOUS-ON-MODE")
    BLINK_OR_CONTINUOUS_ON_MODE("BLINK-OR-CONTINUOUS-ON-MODE"),;
    
    @XmlEnumValue("CONTINUOUS-ON-MODE")
    CONTINUOUS_ON_MODE("CONTINUOUS-ON-MODE"),;
    
    @XmlEnumValue("FAST-FLASHING-MODE")
    FAST_FLASHING_MODE("FAST-FLASHING-MODE"),;
    
    @XmlEnumValue("SLOW-FLASHING-MODE")
    SLOW_FLASHING_MODE("SLOW-FLASHING-MODE");
    

    private final java.lang.String value;

    DiagnosticConnectedIndicatorBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticConnectedIndicatorBehaviorEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticConnectedIndicatorBehaviorEnumSimple c: DiagnosticConnectedIndicatorBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}