package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-TO-SWC-OPERATION-ARGUMENTS-DIRECTION-ENUM--SIMPLE")
@XmlEnum
public enum SwcToSwcOperationArgumentsDirectionEnumSimple {

    
    @XmlEnumValue("IN")
    IN("IN"),;
    
    @XmlEnumValue("OUT")
    OUT("OUT");
    

    private final java.lang.String value;

    SwcToSwcOperationArgumentsDirectionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcToSwcOperationArgumentsDirectionEnumSimple fromValue(java.lang.String v) {
        for (SwcToSwcOperationArgumentsDirectionEnumSimple c: SwcToSwcOperationArgumentsDirectionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}