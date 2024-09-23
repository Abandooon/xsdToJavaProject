package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Framemappings {

    
    
    protected ArrayList<FrameMapping> frameMappings;
    
    

    
    
    @XmlElement(name="FRAME-MAPPING")
    public ArrayList<FrameMapping> getFrameMappings() {
        return this.frameMappings;
    }

    public void setFrameMappings(ArrayList<FrameMapping> value) {
        this.frameMappings = value;
    }
    
    
}