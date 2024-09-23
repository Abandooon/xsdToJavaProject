package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TriggerIPduSendCondition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ModeDeclarationRefs modeDeclarationRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="MODE-DECLARATION-REFS")
    public ModeDeclarationRefs getModeDeclarationRefs() {
        return this.modeDeclarationRefs;
    }

    public void setModeDeclarationRefs(ModeDeclarationRefs value) {
        this.modeDeclarationRefs = value;
    }
    
    
}