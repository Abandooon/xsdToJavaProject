package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class POperationInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextPPortRef contextPPortRef;
    
    
    
    protected TargetProvidedOperationRef targetProvidedOperationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-P-PORT-REF")
    public ContextPPortRef getContextPPortRef() {
        return this.contextPPortRef;
    }

    public void setContextPPortRef(ContextPPortRef value) {
        this.contextPPortRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-PROVIDED-OPERATION-REF")
    public TargetProvidedOperationRef getTargetProvidedOperationRef() {
        return this.targetProvidedOperationRef;
    }

    public void setTargetProvidedOperationRef(TargetProvidedOperationRef value) {
        this.targetProvidedOperationRef = value;
    }
    
    
}