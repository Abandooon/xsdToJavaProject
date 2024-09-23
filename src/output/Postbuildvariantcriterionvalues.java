package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Postbuildvariantcriterionvalues {

    
    
    protected ArrayList<PostBuildVariantCriterionValue> postBuildVariantCriterionValues;
    
    

    
    
    @XmlElement(name="POST-BUILD-VARIANT-CRITERION-VALUE")
    public ArrayList<PostBuildVariantCriterionValue> getPostBuildVariantCriterionValues() {
        return this.postBuildVariantCriterionValues;
    }

    public void setPostBuildVariantCriterionValues(ArrayList<PostBuildVariantCriterionValue> value) {
        this.postBuildVariantCriterionValues = value;
    }
    
    
}