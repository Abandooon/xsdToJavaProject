package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Fibexelements {

    
    
    protected ArrayList<FibexElementRefConditional> fibexElementRefConditionals;
    
    

    
    
    @XmlElement(name="FIBEX-ELEMENT-REF-CONDITIONAL")
    public ArrayList<FibexElementRefConditional> getFibexElementRefConditionals() {
        return this.fibexElementRefConditionals;
    }

    public void setFibexElementRefConditionals(ArrayList<FibexElementRefConditional> value) {
        this.fibexElementRefConditionals = value;
    }
    
    
}