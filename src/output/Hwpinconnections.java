package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwpinconnections {

    
    
    protected ArrayList<HwPinConnector> hwPinConnectors;
    
    

    
    
    @XmlElement(name="HW-PIN-CONNECTOR")
    public ArrayList<HwPinConnector> getHwPinConnectors() {
        return this.hwPinConnectors;
    }

    public void setHwPinConnectors(ArrayList<HwPinConnector> value) {
        this.hwPinConnectors = value;
    }
    
    
}