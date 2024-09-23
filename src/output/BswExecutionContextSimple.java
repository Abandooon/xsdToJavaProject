package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-EXECUTION-CONTEXT--SIMPLE")
@XmlEnum
public enum BswExecutionContextSimple {

    
    @XmlEnumValue("HOOK")
    HOOK("HOOK"),;
    
    @XmlEnumValue("INTERRUPT-CAT-1")
    INTERRUPT_CAT_1("INTERRUPT-CAT-1"),;
    
    @XmlEnumValue("INTERRUPT-CAT-2")
    INTERRUPT_CAT_2("INTERRUPT-CAT-2"),;
    
    @XmlEnumValue("TASK")
    TASK("TASK"),;
    
    @XmlEnumValue("UNSPECIFIED")
    UNSPECIFIED("UNSPECIFIED");
    

    private final java.lang.String value;

    BswExecutionContextSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswExecutionContextSimple fromValue(java.lang.String v) {
        for (BswExecutionContextSimple c: BswExecutionContextSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}