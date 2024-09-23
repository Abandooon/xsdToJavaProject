package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Frameportrefs {

    
    
    protected ArrayList<FramePortRef> framePortRefs;
    
    

    
    
    @XmlElement(name="FRAME-PORT-REF")
    public ArrayList<FramePortRef> getFramePortRefs() {
        return this.framePortRefs;
    }

    public void setFramePortRefs(ArrayList<FramePortRef> value) {
        this.framePortRefs = value;
    }
    
    
}