package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Functionalrequestrefs {

    
    
    protected ArrayList<FunctionalRequestRef> functionalRequestRefs;
    
    

    
    
    @XmlElement(name="FUNCTIONAL-REQUEST-REF")
    public ArrayList<FunctionalRequestRef> getFunctionalRequestRefs() {
        return this.functionalRequestRefs;
    }

    public void setFunctionalRequestRefs(ArrayList<FunctionalRequestRef> value) {
        this.functionalRequestRefs = value;
    }
    
    
}