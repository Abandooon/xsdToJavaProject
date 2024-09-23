package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-PROCESSING-STYLE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticProcessingStyleEnumSimple {

    
    @XmlEnumValue("PROCESSING-STYLE-ASYNCHRONOUS")
    PROCESSING_STYLE_ASYNCHRONOUS("PROCESSING-STYLE-ASYNCHRONOUS"),;
    
    @XmlEnumValue("PROCESSING-STYLE-SYNCHRONOUS")
    PROCESSING_STYLE_SYNCHRONOUS("PROCESSING-STYLE-SYNCHRONOUS");
    

    private final java.lang.String value;

    DiagnosticProcessingStyleEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticProcessingStyleEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticProcessingStyleEnumSimple c: DiagnosticProcessingStyleEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}