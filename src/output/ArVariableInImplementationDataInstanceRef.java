package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ArVariableInImplementationDataInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortPrototypeRef portPrototypeRef;
    
    
    
    protected RootVariableDataPrototypeRef rootVariableDataPrototypeRef;
    
    
    
    protected ContextDataPrototypeRefs contextDataPrototypeRefs;
    
    
    
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
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-REF")
    public PortPrototypeRef getPortPrototypeRef() {
        return this.portPrototypeRef;
    }

    public void setPortPrototypeRef(PortPrototypeRef value) {
        this.portPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    public RootVariableDataPrototypeRef getRootVariableDataPrototypeRef() {
        return this.rootVariableDataPrototypeRef;
    }

    public void setRootVariableDataPrototypeRef(RootVariableDataPrototypeRef value) {
        this.rootVariableDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REFS")
    public ContextDataPrototypeRefs getContextDataPrototypeRefs() {
        return this.contextDataPrototypeRefs;
    }

    public void setContextDataPrototypeRefs(ContextDataPrototypeRefs value) {
        this.contextDataPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef getTargetDataPrototypeRef() {
        return this.targetDataPrototypeRef;
    }

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}