package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Postbuildvariantconditions {

    
    
    protected ArrayList<PostBuildVariantCondition> postBuildVariantConditions;
    
    

    
    
    @XmlElement(name="POST-BUILD-VARIANT-CONDITION")
    public ArrayList<PostBuildVariantCondition> getPostBuildVariantConditions() {
        return this.postBuildVariantConditions;
    }

    public void setPostBuildVariantConditions(ArrayList<PostBuildVariantCondition> value) {
        this.postBuildVariantConditions = value;
    }
    
    
}