package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Portgroups {

    
    
    protected ArrayList<PortGroup> portGroups;
    
    

    
    
    @XmlElement(name="PORT-GROUP")
    public ArrayList<PortGroup> getPortGroups() {
        return this.portGroups;
    }

    public void setPortGroups(ArrayList<PortGroup> value) {
        this.portGroups = value;
    }
    
    
}