package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Successorrefs {

    
    
    protected ArrayList<SuccessorRef> successorRefs;
    
    

    
    
    @XmlElement(name="SUCCESSOR-REF")
    public ArrayList<SuccessorRef> getSuccessorRefs() {
        return this.successorRefs;
    }

    public void setSuccessorRefs(ArrayList<SuccessorRef> value) {
        this.successorRefs = value;
    }
    
    
}