package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ethernetpriorityregenerations {

    
    
    protected ArrayList<EthernetPriorityRegeneration> ethernetPriorityRegenerations;
    
    

    
    
    @XmlElement(name="ETHERNET-PRIORITY-REGENERATION")
    public ArrayList<EthernetPriorityRegeneration> getEthernetPriorityRegenerations() {
        return this.ethernetPriorityRegenerations;
    }

    public void setEthernetPriorityRegenerations(ArrayList<EthernetPriorityRegeneration> value) {
        this.ethernetPriorityRegenerations = value;
    }
    
    
}