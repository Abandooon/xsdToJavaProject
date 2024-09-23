package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Memorysections {

    
    
    protected ArrayList<MemorySection> memorySections;
    
    

    
    
    @XmlElement(name="MEMORY-SECTION")
    public ArrayList<MemorySection> getMemorySections() {
        return this.memorySections;
    }

    public void setMemorySections(ArrayList<MemorySection> value) {
        this.memorySections = value;
    }
    
    
}