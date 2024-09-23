package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FmConditionByFeaturesAndAttributes {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Attributerefs> attributeRefss;
    
    
    
    protected ArrayList<Featurerefs> featureRefss;
    
    

    
    
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
    
    
    
    @XmlElement(name="ATTRIBUTE-REF")
    public ArrayList<Attributerefs> getAttributeRefss() {
        return this.attributeRefss;
    }

    public void setAttributeRefss(ArrayList<Attributerefs> value) {
        this.attributeRefss = value;
    }
    
    
    
    @XmlElement(name="FEATURE-REF")
    public ArrayList<Featurerefs> getFeatureRefss() {
        return this.featureRefss;
    }

    public void setFeatureRefss(ArrayList<Featurerefs> value) {
        this.featureRefss = value;
    }
    
    
}