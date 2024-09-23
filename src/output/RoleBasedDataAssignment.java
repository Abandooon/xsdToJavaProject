package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RoleBasedDataAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier role;
    
    
    
    protected AutosarVariableRef usedDataElement;
    
    
    
    protected AutosarParameterRef usedParameterElement;
    
    
    
    protected UsedPimRef usedPimRef;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
        return this.role;
    }

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
    
    @XmlElement(name="USED-DATA-ELEMENT")
    public AutosarVariableRef getUsedDataElement() {
        return this.usedDataElement;
    }

    public void setUsedDataElement(AutosarVariableRef value) {
        this.usedDataElement = value;
    }
    
    
    
    @XmlElement(name="USED-PARAMETER-ELEMENT")
    public AutosarParameterRef getUsedParameterElement() {
        return this.usedParameterElement;
    }

    public void setUsedParameterElement(AutosarParameterRef value) {
        this.usedParameterElement = value;
    }
    
    
    
    @XmlElement(name="USED-PIM-REF")
    public UsedPimRef getUsedPimRef() {
        return this.usedPimRef;
    }

    public void setUsedPimRef(UsedPimRef value) {
        this.usedPimRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}