package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Memorysectionlocations {

    
    
    protected ArrayList<MemorySectionLocation> memorySectionLocations;
    
    

    
    
    @XmlElement(name="MEMORY-SECTION-LOCATION")
    public ArrayList<MemorySectionLocation> getMemorySectionLocations() {
        return this.memorySectionLocations;
    }

    public void setMemorySectionLocations(ArrayList<MemorySectionLocation> value) {
        this.memorySectionLocations = value;
    }
    
    
}