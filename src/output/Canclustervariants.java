package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Canclustervariants {

    
    
    protected ArrayList<CanClusterConditional> canClusterConditionals;
    
    

    
    
    @XmlElement(name="CAN-CLUSTER-CONDITIONAL")
    public ArrayList<CanClusterConditional> getCanClusterConditionals() {
        return this.canClusterConditionals;
    }

    public void setCanClusterConditionals(ArrayList<CanClusterConditional> value) {
        this.canClusterConditionals = value;
    }
    
    
}