package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Orderedmasterlist {

    
    
    protected ArrayList<OrderedMaster> orderedMasters;
    
    

    
    
    @XmlElement(name="ORDERED-MASTER")
    public ArrayList<OrderedMaster> getOrderedMasters() {
        return this.orderedMasters;
    }

    public void setOrderedMasters(ArrayList<OrderedMaster> value) {
        this.orderedMasters = value;
    }
    
    
}