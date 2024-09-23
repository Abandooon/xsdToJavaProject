package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class InterpolationRoutine {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected Boolean isDefault;
    
    
    
    protected InterpolationRoutineRef interpolationRoutineRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="IS-DEFAULT")
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }
    
    
    
    @XmlElement(name="INTERPOLATION-ROUTINE-REF")
    public InterpolationRoutineRef getInterpolationRoutineRef() {
        return this.interpolationRoutineRef;
    }

    public void setInterpolationRoutineRef(InterpolationRoutineRef value) {
        this.interpolationRoutineRef = value;
    }
    
    
}