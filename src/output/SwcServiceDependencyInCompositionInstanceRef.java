package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwcServiceDependencyInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BaseRef baseRef;
    
    
    
    protected RootContextRef rootContextRef;
    
    
    
    protected ContextSwComponentPrototypeRef contextSwComponentPrototypeRef;
    
    
    
    protected TargetSwcServiceDependencyRef targetSwcServiceDependencyRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="BASE-REF")
    public BaseRef getBaseRef() {
        return this.baseRef;
    }

    public void setBaseRef(BaseRef value) {
        this.baseRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-CONTEXT-REF")
    public RootContextRef getRootContextRef() {
        return this.rootContextRef;
    }

    public void setRootContextRef(RootContextRef value) {
        this.rootContextRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    public ContextSwComponentPrototypeRef getContextSwComponentPrototypeRef() {
        return this.contextSwComponentPrototypeRef;
    }

    public void setContextSwComponentPrototypeRef(ContextSwComponentPrototypeRef value) {
        this.contextSwComponentPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-SWC-SERVICE-DEPENDENCY-REF")
    public TargetSwcServiceDependencyRef getTargetSwcServiceDependencyRef() {
        return this.targetSwcServiceDependencyRef;
    }

    public void setTargetSwcServiceDependencyRef(TargetSwcServiceDependencyRef value) {
        this.targetSwcServiceDependencyRef = value;
    }
    
    
}