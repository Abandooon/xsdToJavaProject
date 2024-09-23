package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ApplicationCompositeElementInPortInterfaceInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected RootDataPrototypeRef rootDataPrototypeRef;
    
    
    
    protected ContextDataPrototypeRef contextDataPrototypeRef;
    
    
    
    protected TargetDataPrototypeRef targetDataPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROOT-DATA-PROTOTYPE-REF")
    public RootDataPrototypeRef getRootDataPrototypeRef() {
        return this.rootDataPrototypeRef;
    }

    public void setRootDataPrototypeRef(RootDataPrototypeRef value) {
        this.rootDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ContextDataPrototypeRef getContextDataPrototypeRef() {
        return this.contextDataPrototypeRef;
    }

    public void setContextDataPrototypeRef(ContextDataPrototypeRef value) {
        this.contextDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef getTargetDataPrototypeRef() {
        return this.targetDataPrototypeRef;
    }

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}