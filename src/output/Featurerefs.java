package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Featurerefs {

    
    
    protected ArrayList<FeatureRef> featureRefs;
    
    

    
    
    @XmlElement(name="FEATURE-REF")
    public ArrayList<FeatureRef> getFeatureRefs() {
        return this.featureRefs;
    }

    public void setFeatureRefs(ArrayList<FeatureRef> value) {
        this.featureRefs = value;
    }
    
    
}