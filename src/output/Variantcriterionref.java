package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variantcriterionref extends Ref {

    
    
    protected PostBuildVariantCriterionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PostBuildVariantCriterionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PostBuildVariantCriterionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}