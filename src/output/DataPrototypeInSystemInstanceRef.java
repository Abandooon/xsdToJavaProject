package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DataPrototypeInSystemInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRootCompositionRef contextRootCompositionRef;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected ContextPortRef contextPortRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-ROOT-COMPOSITION-REF")
    public ContextRootCompositionRef getContextRootCompositionRef() {
        return this.contextRootCompositionRef;
    }

    public void setContextRootCompositionRef(ContextRootCompositionRef value) {
        this.contextRootCompositionRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-REF")
    public ContextComponentRef getContextComponentRef() {
        return this.contextComponentRef;
    }

    public void setContextComponentRef(ContextComponentRef value) {
        this.contextComponentRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-PORT-REF")
    public ContextPortRef getContextPortRef() {
        return this.contextPortRef;
    }

    public void setContextPortRef(ContextPortRef value) {
        this.contextPortRef = value;
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