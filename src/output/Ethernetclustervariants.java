package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ethernetclustervariants {

    
    
    protected ArrayList<EthernetClusterConditional> ethernetClusterConditionals;
    
    

    
    
    @XmlElement(name="ETHERNET-CLUSTER-CONDITIONAL")
    public ArrayList<EthernetClusterConditional> getEthernetClusterConditionals() {
        return this.ethernetClusterConditionals;
    }

    public void setEthernetClusterConditionals(ArrayList<EthernetClusterConditional> value) {
        this.ethernetClusterConditionals = value;
    }
    
    
}