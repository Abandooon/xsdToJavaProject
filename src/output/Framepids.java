package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Framepids {

    
    
    protected ArrayList<FramePid> framePids;
    
    

    
    
    @XmlElement(name="FRAME-PID")
    public ArrayList<FramePid> getFramePids() {
        return this.framePids;
    }

    public void setFramePids(ArrayList<FramePid> value) {
        this.framePids = value;
    }
    
    
}