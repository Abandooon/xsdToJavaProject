package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Predecessoractionrefs {

    
    
    protected ArrayList<PredecessorActionRef> predecessorActionRefs;
    
    

    
    
    @XmlElement(name="PREDECESSOR-ACTION-REF")
    public ArrayList<PredecessorActionRef> getPredecessorActionRefs() {
        return this.predecessorActionRefs;
    }

    public void setPredecessorActionRefs(ArrayList<PredecessorActionRef> value) {
        this.predecessorActionRefs = value;
    }
    
    
}