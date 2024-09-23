package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class VariableInComponentInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected ContextPortPrototypeRef contextPortPrototypeRef;
    
    
    
    protected RootVariableDataPrototypeRef rootVariableDataPrototypeRef;
    
    
    
    protected ContextDataPrototypeRef contextDataPrototypeRef;
    
    
    
    protected TargetDataProtoypeRef targetDataProtoypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    public RootVariableDataPrototypeRef getRootVariableDataPrototypeRef() {
        return this.rootVariableDataPrototypeRef;
    }

    public void setRootVariableDataPrototypeRef(RootVariableDataPrototypeRef value) {
        this.rootVariableDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ContextDataPrototypeRef getContextDataPrototypeRef() {
        return this.contextDataPrototypeRef;
    }

    public void setContextDataPrototypeRef(ContextDataPrototypeRef value) {
        this.contextDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOYPE-REF")
    public TargetDataProtoypeRef getTargetDataProtoypeRef() {
        return this.targetDataProtoypeRef;
    }

    public void setTargetDataProtoypeRef(TargetDataProtoypeRef value) {
        this.targetDataProtoypeRef = value;
    }
    
    
}