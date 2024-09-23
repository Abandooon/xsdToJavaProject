package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BuildActionIoElement {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NmtokenString category;
    
    
    
    protected Sdgs sdgs;
    
    
    
    protected EcucDefinitionRef ecucDefinitionRef;
    
    
    
    protected BuildEngineeringObject engineeringObject;
    
    
    
    protected ForeignModelReference foreignModelReference;
    
    
    
    protected GenericModelReference modelObjectReference;
    
    
    
    protected Identifier role;
    
    

    
    
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
    
    
    
    @XmlElement(name="CATEGORY")
    public NmtokenString getCategory() {
        return this.category;
    }

    public void setCategory(NmtokenString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="SDGS")
    public Sdgs getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(Sdgs value) {
        this.sdgs = value;
    }
    
    
    
    @XmlElement(name="ECUC-DEFINITION-REF")
    public EcucDefinitionRef getEcucDefinitionRef() {
        return this.ecucDefinitionRef;
    }

    public void setEcucDefinitionRef(EcucDefinitionRef value) {
        this.ecucDefinitionRef = value;
    }
    
    
    
    @XmlElement(name="ENGINEERING-OBJECT")
    public BuildEngineeringObject getEngineeringObject() {
        return this.engineeringObject;
    }

    public void setEngineeringObject(BuildEngineeringObject value) {
        this.engineeringObject = value;
    }
    
    
    
    @XmlElement(name="FOREIGN-MODEL-REFERENCE")
    public ForeignModelReference getForeignModelReference() {
        return this.foreignModelReference;
    }

    public void setForeignModelReference(ForeignModelReference value) {
        this.foreignModelReference = value;
    }
    
    
    
    @XmlElement(name="MODEL-OBJECT-REFERENCE")
    public GenericModelReference getModelObjectReference() {
        return this.modelObjectReference;
    }

    public void setModelObjectReference(GenericModelReference value) {
        this.modelObjectReference = value;
    }
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
        return this.role;
    }

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
}