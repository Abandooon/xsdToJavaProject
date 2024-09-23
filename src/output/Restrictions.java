package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Restrictions {

    
    
    protected ArrayList<FmFeatureRestriction> fmFeatureRestrictions;
    
    

    
    
    @XmlElement(name="FM-FEATURE-RESTRICTION")
    public ArrayList<FmFeatureRestriction> getFmFeatureRestrictions() {
        return this.fmFeatureRestrictions;
    }

    public void setFmFeatureRestrictions(ArrayList<FmFeatureRestriction> value) {
        this.fmFeatureRestrictions = value;
    }
    
    
}