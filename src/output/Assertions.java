package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assertions {

    
    
    protected ArrayList<FmFeatureMapAssertion> fmFeatureMapAssertions;
    
    

    
    
    @XmlElement(name="FM-FEATURE-MAP-ASSERTION")
    public ArrayList<FmFeatureMapAssertion> getFmFeatureMapAssertions() {
        return this.fmFeatureMapAssertions;
    }

    public void setFmFeatureMapAssertions(ArrayList<FmFeatureMapAssertion> value) {
        this.fmFeatureMapAssertions = value;
    }
    
    
}