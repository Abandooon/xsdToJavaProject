package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RModeGroupInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRPortRef contextRPortRef;
    
    
    
    protected TargetModeGroupRef targetModeGroupRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-R-PORT-REF")
    public ContextRPortRef getContextRPortRef() {
        return this.contextRPortRef;
    }

    public void setContextRPortRef(ContextRPortRef value) {
        this.contextRPortRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-MODE-GROUP-REF")
    public TargetModeGroupRef getTargetModeGroupRef() {
        return this.targetModeGroupRef;
    }

    public void setTargetModeGroupRef(TargetModeGroupRef value) {
        this.targetModeGroupRef = value;
    }
    
    
}