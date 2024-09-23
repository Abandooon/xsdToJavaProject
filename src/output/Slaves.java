package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Slaves {

    
    
    protected ArrayList<GlobalTimeCanSlave> globalTimeCanSlaves;
    
    
    
    protected ArrayList<GlobalTimeEthSlave> globalTimeEthSlaves;
    
    
    
    protected ArrayList<GlobalTimeFrSlave> globalTimeFrSlaves;
    
    

    
    
    @XmlElement(name="GLOBAL-TIME-CAN-SLAVE")
    public ArrayList<GlobalTimeCanSlave> getGlobalTimeCanSlaves() {
        return this.globalTimeCanSlaves;
    }

    public void setGlobalTimeCanSlaves(ArrayList<GlobalTimeCanSlave> value) {
        this.globalTimeCanSlaves = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-ETH-SLAVE")
    public ArrayList<GlobalTimeEthSlave> getGlobalTimeEthSlaves() {
        return this.globalTimeEthSlaves;
    }

    public void setGlobalTimeEthSlaves(ArrayList<GlobalTimeEthSlave> value) {
        this.globalTimeEthSlaves = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-FR-SLAVE")
    public ArrayList<GlobalTimeFrSlave> getGlobalTimeFrSlaves() {
        return this.globalTimeFrSlaves;
    }

    public void setGlobalTimeFrSlaves(ArrayList<GlobalTimeFrSlave> value) {
        this.globalTimeFrSlaves = value;
    }
    
    
}