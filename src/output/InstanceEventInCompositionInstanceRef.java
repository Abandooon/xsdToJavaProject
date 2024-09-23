package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class InstanceEventInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextComponentPrototypeRef contextComponentPrototypeRef;
    
    
    
    protected TargetEventRef targetEventRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-PROTOTYPE-REF")
    public ContextComponentPrototypeRef getContextComponentPrototypeRef() {
        return this.contextComponentPrototypeRef;
    }

    public void setContextComponentPrototypeRef(ContextComponentPrototypeRef value) {
        this.contextComponentPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-EVENT-REF")
    public TargetEventRef getTargetEventRef() {
        return this.targetEventRef;
    }

    public void setTargetEventRef(TargetEventRef value) {
        this.targetEventRef = value;
    }
    
    
}