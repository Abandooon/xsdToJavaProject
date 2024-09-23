package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assignedtrafficclasss {

    
    
    protected ArrayList<PositiveInteger> assignedTrafficClasss;
    
    

    
    
    @XmlElement(name="ASSIGNED-TRAFFIC-CLASS")
    public ArrayList<PositiveInteger> getAssignedTrafficClasss() {
        return this.assignedTrafficClasss;
    }

    public void setAssignedTrafficClasss(ArrayList<PositiveInteger> value) {
        this.assignedTrafficClasss = value;
    }
    
    
}