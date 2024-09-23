package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ttcanclustervariants {

    
    
    protected ArrayList<TtcanClusterConditional> ttcanClusterConditionals;
    
    

    
    
    @XmlElement(name="TTCAN-CLUSTER-CONDITIONAL")
    public ArrayList<TtcanClusterConditional> getTtcanClusterConditionals() {
        return this.ttcanClusterConditionals;
    }

    public void setTtcanClusterConditionals(ArrayList<TtcanClusterConditional> value) {
        this.ttcanClusterConditionals = value;
    }
    
    
}