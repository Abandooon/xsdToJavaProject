package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ComponentInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected TargetComponentRef targetComponentRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="TARGET-COMPONENT-REF")
    public TargetComponentRef getTargetComponentRef() {
        return this.targetComponentRef;
    }

    public void setTargetComponentRef(TargetComponentRef value) {
        this.targetComponentRef = value;
    }
    
    
}