package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Portapioptions {

    
    
    protected ArrayList<PortApiOption> portApiOptions;
    
    

    
    
    @XmlElement(name="PORT-API-OPTION")
    public ArrayList<PortApiOption> getPortApiOptions() {
        return this.portApiOptions;
    }

    public void setPortApiOptions(ArrayList<PortApiOption> value) {
        this.portApiOptions = value;
    }
    
    
}