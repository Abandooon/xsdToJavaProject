package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Emulationsupports {

    
    
    protected ArrayList<McSwEmulationMethodSupport> mcSwEmulationMethodSupports;
    
    

    
    
    @XmlElement(name="MC-SW-EMULATION-METHOD-SUPPORT")
    public ArrayList<McSwEmulationMethodSupport> getMcSwEmulationMethodSupports() {
        return this.mcSwEmulationMethodSupports;
    }

    public void setMcSwEmulationMethodSupports(ArrayList<McSwEmulationMethodSupport> value) {
        this.mcSwEmulationMethodSupports = value;
    }
    
    
}