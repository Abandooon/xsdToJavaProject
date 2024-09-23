package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TriggerInSystemInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextCompositionRef contextCompositionRef;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected ContextPortRef contextPortRef;
    
    
    
    protected TargetTriggerRef targetTriggerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPOSITION-REF")
    public ContextCompositionRef getContextCompositionRef() {
        return this.contextCompositionRef;
    }

    public void setContextCompositionRef(ContextCompositionRef value) {
        this.contextCompositionRef = value;
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
    
    
    
    @XmlElement(name="TARGET-TRIGGER-REF")
    public TargetTriggerRef getTargetTriggerRef() {
        return this.targetTriggerRef;
    }

    public void setTargetTriggerRef(TargetTriggerRef value) {
        this.targetTriggerRef = value;
    }
    
    
}