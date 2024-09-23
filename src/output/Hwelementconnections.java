package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwelementconnections {

    
    
    protected ArrayList<HwElementConnector> hwElementConnectors;
    
    

    
    
    @XmlElement(name="HW-ELEMENT-CONNECTOR")
    public ArrayList<HwElementConnector> getHwElementConnectors() {
        return this.hwElementConnectors;
    }

    public void setHwElementConnectors(ArrayList<HwElementConnector> value) {
        this.hwElementConnectors = value;
    }
    
    
}