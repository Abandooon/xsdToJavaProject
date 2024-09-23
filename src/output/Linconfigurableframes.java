package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linconfigurableframes {

    
    
    protected ArrayList<LinConfigurableFrame> linConfigurableFrames;
    
    

    
    
    @XmlElement(name="LIN-CONFIGURABLE-FRAME")
    public ArrayList<LinConfigurableFrame> getLinConfigurableFrames() {
        return this.linConfigurableFrames;
    }

    public void setLinConfigurableFrames(ArrayList<LinConfigurableFrame> value) {
        this.linConfigurableFrames = value;
    }
    
    
}