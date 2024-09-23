package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Selections {

    
    
    protected ArrayList<FmFeatureSelection> fmFeatureSelections;
    
    

    
    
    @XmlElement(name="FM-FEATURE-SELECTION")
    public ArrayList<FmFeatureSelection> getFmFeatureSelections() {
        return this.fmFeatureSelections;
    }

    public void setFmFeatureSelections(ArrayList<FmFeatureSelection> value) {
        this.fmFeatureSelections = value;
    }
    
    
}