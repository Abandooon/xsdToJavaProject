package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Memorydestinationrefs {

    
    
    protected ArrayList<MemoryDestinationRef> memoryDestinationRefs;
    
    

    
    
    @XmlElement(name="MEMORY-DESTINATION-REF")
    public ArrayList<MemoryDestinationRef> getMemoryDestinationRefs() {
        return this.memoryDestinationRefs;
    }

    public void setMemoryDestinationRefs(ArrayList<MemoryDestinationRef> value) {
        this.memoryDestinationRefs = value;
    }
    
    
}