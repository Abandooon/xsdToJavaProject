package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PortPrototypeBlueprintMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortPrototypeBlueprintRef portPrototypeBlueprintRef;
    
    
    
    protected DerivedPortPrototypeRef derivedPortPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-BLUEPRINT-REF")
    public PortPrototypeBlueprintRef getPortPrototypeBlueprintRef() {
        return this.portPrototypeBlueprintRef;
    }

    public void setPortPrototypeBlueprintRef(PortPrototypeBlueprintRef value) {
        this.portPrototypeBlueprintRef = value;
    }
    
    
    
    @XmlElement(name="DERIVED-PORT-PROTOTYPE-REF")
    public DerivedPortPrototypeRef getDerivedPortPrototypeRef() {
        return this.derivedPortPrototypeRef;
    }

    public void setDerivedPortPrototypeRef(DerivedPortPrototypeRef value) {
        this.derivedPortPrototypeRef = value;
    }
    
    
}