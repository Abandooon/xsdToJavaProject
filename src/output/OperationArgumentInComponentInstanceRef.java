package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class OperationArgumentInComponentInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BaseRef baseRef;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected ContextPortPrototypeRef contextPortPrototypeRef;
    
    
    
    protected ContextOperationRef contextOperationRef;
    
    
    
    protected RootArgumentDataPrototypeRef rootArgumentDataPrototypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="BASE-REF")
    public BaseRef getBaseRef() {
        return this.baseRef;
    }

    public void setBaseRef(BaseRef value) {
        this.baseRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-REF")
    public ContextComponentRef getContextComponentRef() {
        return this.contextComponentRef;
    }

    public void setContextComponentRef(ContextComponentRef value) {
        this.contextComponentRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-PORT-PROTOTYPE-REF")
    public ContextPortPrototypeRef getContextPortPrototypeRef() {
        return this.contextPortPrototypeRef;
    }

    public void setContextPortPrototypeRef(ContextPortPrototypeRef value) {
        this.contextPortPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-OPERATION-REF")
    public ContextOperationRef getContextOperationRef() {
        return this.contextOperationRef;
    }

    public void setContextOperationRef(ContextOperationRef value) {
        this.contextOperationRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-ARGUMENT-DATA-PROTOTYPE-REF")
    public RootArgumentDataPrototypeRef getRootArgumentDataPrototypeRef() {
        return this.rootArgumentDataPrototypeRef;
    }

    public void setRootArgumentDataPrototypeRef(RootArgumentDataPrototypeRef value) {
        this.rootArgumentDataPrototypeRef = value;
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