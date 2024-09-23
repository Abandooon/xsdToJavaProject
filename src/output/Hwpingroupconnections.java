package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwpingroupconnections {

    
    
    protected ArrayList<HwPinGroupConnector> hwPinGroupConnectors;
    
    

    
    
    @XmlElement(name="HW-PIN-GROUP-CONNECTOR")
    public ArrayList<HwPinGroupConnector> getHwPinGroupConnectors() {
        return this.hwPinGroupConnectors;
    }

    public void setHwPinGroupConnectors(ArrayList<HwPinGroupConnector> value) {
        this.hwPinGroupConnectors = value;
    }
    
    
}