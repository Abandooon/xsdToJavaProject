package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggermappings {

    
    
    protected ArrayList<TriggerMapping> triggerMappings;
    
    

    
    
    @XmlElement(name="TRIGGER-MAPPING")
    public ArrayList<TriggerMapping> getTriggerMappings() {
        return this.triggerMappings;
    }

    public void setTriggerMappings(ArrayList<TriggerMapping> value) {
        this.triggerMappings = value;
    }
    
    
}