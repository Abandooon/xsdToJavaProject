package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ethernettrafficclassassignments {

    
    
    protected ArrayList<CouplingPortTrafficClassAssignment> couplingPortTrafficClassAssignments;
    
    

    
    
    @XmlElement(name="COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT")
    public ArrayList<CouplingPortTrafficClassAssignment> getCouplingPortTrafficClassAssignments() {
        return this.couplingPortTrafficClassAssignments;
    }

    public void setCouplingPortTrafficClassAssignments(ArrayList<CouplingPortTrafficClassAssignment> value) {
        this.couplingPortTrafficClassAssignments = value;
    }
    
    
}