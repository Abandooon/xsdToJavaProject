package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McSwEmulationMethodSupport {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected Identifier category;
    
    
    
    protected BaseReferenceRef baseReferenceRef;
    
    
    
    protected ElementGroups elementGroups;
    
    
    
    protected ReferenceTableRef referenceTableRef;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public Identifier getCategory() {
        return this.category;
    }

    public void setCategory(Identifier value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="BASE-REFERENCE-REF")
    public BaseReferenceRef getBaseReferenceRef() {
        return this.baseReferenceRef;
    }

    public void setBaseReferenceRef(BaseReferenceRef value) {
        this.baseReferenceRef = value;
    }
    
    
    
    @XmlElement(name="ELEMENT-GROUPS")
    public ElementGroups getElementGroups() {
        return this.elementGroups;
    }

    public void setElementGroups(ElementGroups value) {
        this.elementGroups = value;
    }
    
    
    
    @XmlElement(name="REFERENCE-TABLE-REF")
    public ReferenceTableRef getReferenceTableRef() {
        return this.referenceTableRef;
    }

    public void setReferenceTableRef(ReferenceTableRef value) {
        this.referenceTableRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}