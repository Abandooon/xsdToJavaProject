package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Memoryrangerefs {

    
    
    protected ArrayList<MemoryRangeRef> memoryRangeRefs;
    
    

    
    
    @XmlElement(name="MEMORY-RANGE-REF")
    public ArrayList<MemoryRangeRef> getMemoryRangeRefs() {
        return this.memoryRangeRefs;
    }

    public void setMemoryRangeRefs(ArrayList<MemoryRangeRef> value) {
        this.memoryRangeRefs = value;
    }
    
    
}