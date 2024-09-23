package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Postbuildvariantcriterionvaluesetrefs {

    
    
    protected ArrayList<PostBuildVariantCriterionValueSetRef> postBuildVariantCriterionValueSetRefs;
    
    

    
    
    @XmlElement(name="POST-BUILD-VARIANT-CRITERION-VALUE-SET-REF")
    public ArrayList<PostBuildVariantCriterionValueSetRef> getPostBuildVariantCriterionValueSetRefs() {
        return this.postBuildVariantCriterionValueSetRefs;
    }

    public void setPostBuildVariantCriterionValueSetRefs(ArrayList<PostBuildVariantCriterionValueSetRef> value) {
        this.postBuildVariantCriterionValueSetRefs = value;
    }
    
    
}