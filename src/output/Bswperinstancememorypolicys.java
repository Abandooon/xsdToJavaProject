package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswperinstancememorypolicys {

    
    
    protected ArrayList<BswPerInstanceMemoryPolicy> bswPerInstanceMemoryPolicys;
    
    

    
    
    @XmlElement(name="BSW-PER-INSTANCE-MEMORY-POLICY")
    public ArrayList<BswPerInstanceMemoryPolicy> getBswPerInstanceMemoryPolicys() {
        return this.bswPerInstanceMemoryPolicys;
    }

    public void setBswPerInstanceMemoryPolicys(ArrayList<BswPerInstanceMemoryPolicy> value) {
        this.bswPerInstanceMemoryPolicys = value;
    }
    
    
}