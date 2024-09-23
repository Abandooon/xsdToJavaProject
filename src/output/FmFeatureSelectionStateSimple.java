package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FM-FEATURE-SELECTION-STATE--SIMPLE")
@XmlEnum
public enum FmFeatureSelectionStateSimple {

    
    @XmlEnumValue("DESELECTED")
    DESELECTED("DESELECTED"),;
    
    @XmlEnumValue("SELECTED")
    SELECTED("SELECTED"),;
    
    @XmlEnumValue("UNDECIDED")
    UNDECIDED("UNDECIDED");
    

    private final java.lang.String value;

    FmFeatureSelectionStateSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FmFeatureSelectionStateSimple fromValue(java.lang.String v) {
        for (FmFeatureSelectionStateSimple c: FmFeatureSelectionStateSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}