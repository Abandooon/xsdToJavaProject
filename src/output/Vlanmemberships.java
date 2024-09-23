package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Vlanmemberships {

    
    
    protected ArrayList<VlanMembership> vlanMemberships;
    
    

    
    
    @XmlElement(name="VLAN-MEMBERSHIP")
    public ArrayList<VlanMembership> getVlanMemberships() {
        return this.vlanMemberships;
    }

    public void setVlanMemberships(ArrayList<VlanMembership> value) {
        this.vlanMemberships = value;
    }
    
    
}