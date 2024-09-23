package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Macmulticastgroups {

    
    
    protected ArrayList<MacMulticastGroup> macMulticastGroups;
    
    

    
    
    @XmlElement(name="MAC-MULTICAST-GROUP")
    public ArrayList<MacMulticastGroup> getMacMulticastGroups() {
        return this.macMulticastGroups;
    }

    public void setMacMulticastGroups(ArrayList<MacMulticastGroup> value) {
        this.macMulticastGroups = value;
    }
    
    
}