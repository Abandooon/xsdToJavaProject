package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwDataDependency {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuGenericMath swDataDependencyFormula;
    
    
    
    protected SwDataDependencyArgs swDataDependencyArgs;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-DATA-DEPENDENCY-FORMULA")
    public CompuGenericMath getSwDataDependencyFormula() {
        return this.swDataDependencyFormula;
    }

    public void setSwDataDependencyFormula(CompuGenericMath value) {
        this.swDataDependencyFormula = value;
    }
    
    
    
    @XmlElement(name="SW-DATA-DEPENDENCY-ARGS")
    public SwDataDependencyArgs getSwDataDependencyArgs() {
        return this.swDataDependencyArgs;
    }

    public void setSwDataDependencyArgs(SwDataDependencyArgs value) {
        this.swDataDependencyArgs = value;
    }
    
    
}