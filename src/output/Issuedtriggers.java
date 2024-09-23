package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Issuedtriggers {

    
    
    protected ArrayList<TriggerRefConditional> triggerRefConditionals;
    
    

    
    
    @XmlElement(name="TRIGGER-REF-CONDITIONAL")
    public ArrayList<TriggerRefConditional> getTriggerRefConditionals() {
        return this.triggerRefConditionals;
    }

    public void setTriggerRefConditionals(ArrayList<TriggerRefConditional> value) {
        this.triggerRefConditionals = value;
    }
    
    
}