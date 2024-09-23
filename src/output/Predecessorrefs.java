package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Predecessorrefs {

    
    
    protected ArrayList<PredecessorRef> predecessorRefs;
    
    

    
    
    @XmlElement(name="PREDECESSOR-REF")
    public ArrayList<PredecessorRef> getPredecessorRefs() {
        return this.predecessorRefs;
    }

    public void setPredecessorRefs(ArrayList<PredecessorRef> value) {
        this.predecessorRefs = value;
    }
    
    
}