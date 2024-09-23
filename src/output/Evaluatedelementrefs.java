package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Evaluatedelementrefs {

    
    
    protected ArrayList<EvaluatedElementRef> evaluatedElementRefs;
    
    

    
    
    @XmlElement(name="EVALUATED-ELEMENT-REF")
    public ArrayList<EvaluatedElementRef> getEvaluatedElementRefs() {
        return this.evaluatedElementRefs;
    }

    public void setEvaluatedElementRefs(ArrayList<EvaluatedElementRef> value) {
        this.evaluatedElementRefs = value;
    }
    
    
}