package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Evaluatedvariantrefs {

    
    
    protected ArrayList<EvaluatedVariantRef> evaluatedVariantRefs;
    
    

    
    
    @XmlElement(name="EVALUATED-VARIANT-REF")
    public ArrayList<EvaluatedVariantRef> getEvaluatedVariantRefs() {
        return this.evaluatedVariantRefs;
    }

    public void setEvaluatedVariantRefs(ArrayList<EvaluatedVariantRef> value) {
        this.evaluatedVariantRefs = value;
    }
    
    
}