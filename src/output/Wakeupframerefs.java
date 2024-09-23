package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Wakeupframerefs {

    
    
    protected ArrayList<WakeupFrameRef> wakeupFrameRefs;
    
    

    
    
    @XmlElement(name="WAKEUP-FRAME-REF")
    public ArrayList<WakeupFrameRef> getWakeupFrameRefs() {
        return this.wakeupFrameRefs;
    }

    public void setWakeupFrameRefs(ArrayList<WakeupFrameRef> value) {
        this.wakeupFrameRefs = value;
    }
    
    
}