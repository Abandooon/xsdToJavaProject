package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Destinationrefs {

    
    
    protected ArrayList<DestinationRef> destinationRefs;
    
    

    
    
    @XmlElement(name="DESTINATION-REF")
    public ArrayList<DestinationRef> getDestinationRefs() {
        return this.destinationRefs;
    }

    public void setDestinationRefs(ArrayList<DestinationRef> value) {
        this.destinationRefs = value;
    }
    
    
}