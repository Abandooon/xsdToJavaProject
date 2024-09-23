package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Routinggrouprefs {

    
    
    protected ArrayList<RoutingGroupRef> routingGroupRefs;
    
    

    
    
    @XmlElement(name="ROUTING-GROUP-REF")
    public ArrayList<RoutingGroupRef> getRoutingGroupRefs() {
        return this.routingGroupRefs;
    }

    public void setRoutingGroupRefs(ArrayList<RoutingGroupRef> value) {
        this.routingGroupRefs = value;
    }
    
    
}