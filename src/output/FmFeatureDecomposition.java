package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FmFeatureDecomposition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CategoryString category;
    
    
    
    protected FeatureRefs featureRefs;
    
    
    
    protected PositiveInteger max;
    
    
    
    protected PositiveInteger min;
    
    

    
    
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
    public CategoryString getCategory() {
        return this.category;
    }

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="FEATURE-REFS")
    public FeatureRefs getFeatureRefs() {
        return this.featureRefs;
    }

    public void setFeatureRefs(FeatureRefs value) {
        this.featureRefs = value;
    }
    
    
    
    @XmlElement(name="MAX")
    public PositiveInteger getMax() {
        return this.max;
    }

    public void setMax(PositiveInteger value) {
        this.max = value;
    }
    
    
    
    @XmlElement(name="MIN")
    public PositiveInteger getMin() {
        return this.min;
    }

    public void setMin(PositiveInteger value) {
        this.min = value;
    }
    
    
}