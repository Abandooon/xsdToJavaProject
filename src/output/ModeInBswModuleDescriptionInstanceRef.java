package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ModeInBswModuleDescriptionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextModeDeclarationGroupRef contextModeDeclarationGroupRef;
    
    
    
    protected TargetModeRef targetModeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-MODE-DECLARATION-GROUP-REF")
    public ContextModeDeclarationGroupRef getContextModeDeclarationGroupRef() {
        return this.contextModeDeclarationGroupRef;
    }

    public void setContextModeDeclarationGroupRef(ContextModeDeclarationGroupRef value) {
        this.contextModeDeclarationGroupRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-MODE-REF")
    public TargetModeRef getTargetModeRef() {
        return this.targetModeRef;
    }

    public void setTargetModeRef(TargetModeRef value) {
        this.targetModeRef = value;
    }
    
    
}