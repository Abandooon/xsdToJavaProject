package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Featuremodelrefs {

    
    
    protected ArrayList<FeatureModelRef> featureModelRefs;
    
    

    
    
    @XmlElement(name="FEATURE-MODEL-REF")
    public ArrayList<FeatureModelRef> getFeatureModelRefs() {
        return this.featureModelRefs;
    }

    public void setFeatureModelRefs(ArrayList<FeatureModelRef> value) {
        this.featureModelRefs = value;
    }
    
    
}