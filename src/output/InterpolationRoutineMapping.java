package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class InterpolationRoutineMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected InterpolationRoutines interpolationRoutines;
    
    
    
    protected SwRecordLayoutRef swRecordLayoutRef;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="INTERPOLATION-ROUTINES")
    public InterpolationRoutines getInterpolationRoutines() {
        return this.interpolationRoutines;
    }

    public void setInterpolationRoutines(InterpolationRoutines value) {
        this.interpolationRoutines = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-REF")
    public SwRecordLayoutRef getSwRecordLayoutRef() {
        return this.swRecordLayoutRef;
    }

    public void setSwRecordLayoutRef(SwRecordLayoutRef value) {
        this.swRecordLayoutRef = value;
    }
    
    
}