package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linslaves {

    
    
    protected ArrayList<LinSlaveConfig> linSlaveConfigs;
    
    

    
    
    @XmlElement(name="LIN-SLAVE-CONFIG")
    public ArrayList<LinSlaveConfig> getLinSlaveConfigs() {
        return this.linSlaveConfigs;
    }

    public void setLinSlaveConfigs(ArrayList<LinSlaveConfig> value) {
        this.linSlaveConfigs = value;
    }
    
    
}