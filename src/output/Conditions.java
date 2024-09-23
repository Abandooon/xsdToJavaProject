package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Conditions {

    
    
    protected ArrayList<FmFeatureMapCondition> fmFeatureMapConditions;
    
    

    
    
    @XmlElement(name="FM-FEATURE-MAP-CONDITION")
    public ArrayList<FmFeatureMapCondition> getFmFeatureMapConditions() {
        return this.fmFeatureMapConditions;
    }

    public void setFmFeatureMapConditions(ArrayList<FmFeatureMapCondition> value) {
        this.fmFeatureMapConditions = value;
    }
    
    
}