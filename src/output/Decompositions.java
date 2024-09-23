package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Decompositions {

    
    
    protected ArrayList<FmFeatureDecomposition> fmFeatureDecompositions;
    
    

    
    
    @XmlElement(name="FM-FEATURE-DECOMPOSITION")
    public ArrayList<FmFeatureDecomposition> getFmFeatureDecompositions() {
        return this.fmFeatureDecompositions;
    }

    public void setFmFeatureDecompositions(ArrayList<FmFeatureDecomposition> value) {
        this.fmFeatureDecompositions = value;
    }
    
    
}