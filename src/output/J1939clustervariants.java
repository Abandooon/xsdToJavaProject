package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class J1939clustervariants {

    
    
    protected ArrayList<J1939ClusterConditional> j1939ClusterConditionals;
    
    

    
    
    @XmlElement(name="J-1939-CLUSTER-CONDITIONAL")
    public ArrayList<J1939ClusterConditional> getJ1939ClusterConditionals() {
        return this.j1939ClusterConditionals;
    }

    public void setJ1939ClusterConditionals(ArrayList<J1939ClusterConditional> value) {
        this.j1939ClusterConditionals = value;
    }
    
    
}