package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Relations {

    
    
    protected ArrayList<FmFeatureRelation> fmFeatureRelations;
    
    

    
    
    @XmlElement(name="FM-FEATURE-RELATION")
    public ArrayList<FmFeatureRelation> getFmFeatureRelations() {
        return this.fmFeatureRelations;
    }

    public void setFmFeatureRelations(ArrayList<FmFeatureRelation> value) {
        this.fmFeatureRelations = value;
    }
    
    
}