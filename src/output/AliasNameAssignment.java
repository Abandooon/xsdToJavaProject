package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class AliasNameAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String shortLabel;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected IdentifiableRef identifiableRef;
    
    
    
    protected FlatInstanceRef flatInstanceRef;
    
    
    
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
    public String getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(String value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="LABEL")
    public MultilanguageLongName getLabel() {
        return this.label;
    }

    public void setLabel(MultilanguageLongName value) {
        this.label = value;
    }
    
    
    
    @XmlElement(name="IDENTIFIABLE-REF")
    public IdentifiableRef getIdentifiableRef() {
        return this.identifiableRef;
    }

    public void setIdentifiableRef(IdentifiableRef value) {
        this.identifiableRef = value;
    }
    
    
    
    @XmlElement(name="FLAT-INSTANCE-REF")
    public FlatInstanceRef getFlatInstanceRef() {
        return this.flatInstanceRef;
    }

    public void setFlatInstanceRef(FlatInstanceRef value) {
        this.flatInstanceRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}