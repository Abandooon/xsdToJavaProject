package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linclustervariants {

    
    
    protected ArrayList<LinClusterConditional> linClusterConditionals;
    
    

    
    
    @XmlElement(name="LIN-CLUSTER-CONDITIONAL")
    public ArrayList<LinClusterConditional> getLinClusterConditionals() {
        return this.linClusterConditionals;
    }

    public void setLinClusterConditionals(ArrayList<LinClusterConditional> value) {
        this.linClusterConditionals = value;
    }
    
    
}