package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Perinstancememorysizes {

    
    
    protected ArrayList<PerInstanceMemorySize> perInstanceMemorySizes;
    
    

    
    
    @XmlElement(name="PER-INSTANCE-MEMORY-SIZE")
    public ArrayList<PerInstanceMemorySize> getPerInstanceMemorySizes() {
        return this.perInstanceMemorySizes;
    }

    public void setPerInstanceMemorySizes(ArrayList<PerInstanceMemorySize> value) {
        this.perInstanceMemorySizes = value;
    }
    
    
}