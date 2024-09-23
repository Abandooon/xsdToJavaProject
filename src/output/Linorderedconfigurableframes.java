package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linorderedconfigurableframes {

    
    
    protected ArrayList<LinOrderedConfigurableFrame> linOrderedConfigurableFrames;
    
    

    
    
    @XmlElement(name="LIN-ORDERED-CONFIGURABLE-FRAME")
    public ArrayList<LinOrderedConfigurableFrame> getLinOrderedConfigurableFrames() {
        return this.linOrderedConfigurableFrames;
    }

    public void setLinOrderedConfigurableFrames(ArrayList<LinOrderedConfigurableFrame> value) {
        this.linOrderedConfigurableFrames = value;
    }
    
    
}