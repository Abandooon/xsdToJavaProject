package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignaltoipdumappings {

    
    
    protected ArrayList<ISignalToIPduMapping> iSignalToIPduMappings;
    
    

    
    
    @XmlElement(name="I-SIGNAL-TO-I-PDU-MAPPING")
    public ArrayList<ISignalToIPduMapping> getISignalToIPduMappings() {
        return this.iSignalToIPduMappings;
    }

    public void setISignalToIPduMappings(ArrayList<ISignalToIPduMapping> value) {
        this.iSignalToIPduMappings = value;
    }
    
    
}