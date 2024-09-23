package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Inputdatas {

    
    
    protected ArrayList<BuildActionIoElement> buildActionIoElements;
    
    

    
    
    @XmlElement(name="BUILD-ACTION-IO-ELEMENT")
    public ArrayList<BuildActionIoElement> getBuildActionIoElements() {
        return this.buildActionIoElements;
    }

    public void setBuildActionIoElements(ArrayList<BuildActionIoElement> value) {
        this.buildActionIoElements = value;
    }
    
    
}