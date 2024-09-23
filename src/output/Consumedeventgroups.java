package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Consumedeventgroups {

    
    
    protected ArrayList<ConsumedEventGroup> consumedEventGroups;
    
    

    
    
    @XmlElement(name="CONSUMED-EVENT-GROUP")
    public ArrayList<ConsumedEventGroup> getConsumedEventGroups() {
        return this.consumedEventGroups;
    }

    public void setConsumedEventGroups(ArrayList<ConsumedEventGroup> value) {
        this.consumedEventGroups = value;
    }
    
    
}