package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggerdirectimplementations {

    
    
    protected ArrayList<BswTriggerDirectImplementation> bswTriggerDirectImplementations;
    
    

    
    
    @XmlElement(name="BSW-TRIGGER-DIRECT-IMPLEMENTATION")
    public ArrayList<BswTriggerDirectImplementation> getBswTriggerDirectImplementations() {
        return this.bswTriggerDirectImplementations;
    }

    public void setBswTriggerDirectImplementations(ArrayList<BswTriggerDirectImplementation> value) {
        this.bswTriggerDirectImplementations = value;
    }
    
    
}