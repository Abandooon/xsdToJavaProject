package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requiredtriggers {

    
    
    protected ArrayList<Trigger> triggers;
    
    

    
    
    @XmlElement(name="TRIGGER")
    public ArrayList<Trigger> getTriggers() {
        return this.triggers;
    }

    public void setTriggers(ArrayList<Trigger> value) {
        this.triggers = value;
    }
    
    
}