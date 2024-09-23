package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EXECUTION-ORDER-CONSTRAINT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ExecutionOrderConstraintTypeEnumSimple {

    
    @XmlEnumValue("HIERARCHICAL-EOC")
    HIERARCHICAL_EOC("HIERARCHICAL-EOC"),;
    
    @XmlEnumValue("ORDINARY-EOC")
    ORDINARY_EOC("ORDINARY-EOC"),;
    
    @XmlEnumValue("REPETITIVE-EOC")
    REPETITIVE_EOC("REPETITIVE-EOC");
    

    private final java.lang.String value;

    ExecutionOrderConstraintTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExecutionOrderConstraintTypeEnumSimple fromValue(java.lang.String v) {
        for (ExecutionOrderConstraintTypeEnumSimple c: ExecutionOrderConstraintTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}