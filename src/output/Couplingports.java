package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Couplingports {

    
    
    protected ArrayList<CouplingPort> couplingPorts;
    
    

    
    
    @XmlElement(name="COUPLING-PORT")
    public ArrayList<CouplingPort> getCouplingPorts() {
        return this.couplingPorts;
    }

    public void setCouplingPorts(ArrayList<CouplingPort> value) {
        this.couplingPorts = value;
    }
    
    
}