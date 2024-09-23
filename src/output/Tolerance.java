package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tolerance {

    
    
    protected AbsoluteTolerance absoluteTolerance;
    
    
    
    protected RelativeTolerance relativeTolerance;
    
    

    
    
    @XmlElement(name="ABSOLUTE-TOLERANCE")
    public AbsoluteTolerance getAbsoluteTolerance() {
        return this.absoluteTolerance;
    }

    public void setAbsoluteTolerance(AbsoluteTolerance value) {
        this.absoluteTolerance = value;
    }
    
    
    
    @XmlElement(name="RELATIVE-TOLERANCE")
    public RelativeTolerance getRelativeTolerance() {
        return this.relativeTolerance;
    }

    public void setRelativeTolerance(RelativeTolerance value) {
        this.relativeTolerance = value;
    }
    
    
}