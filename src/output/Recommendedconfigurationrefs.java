package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Recommendedconfigurationrefs {

    
    
    protected ArrayList<RecommendedConfigurationRef> recommendedConfigurationRefs;
    
    

    
    
    @XmlElement(name="RECOMMENDED-CONFIGURATION-REF")
    public ArrayList<RecommendedConfigurationRef> getRecommendedConfigurationRefs() {
        return this.recommendedConfigurationRefs;
    }

    public void setRecommendedConfigurationRefs(ArrayList<RecommendedConfigurationRef> value) {
        this.recommendedConfigurationRefs = value;
    }
    
    
}