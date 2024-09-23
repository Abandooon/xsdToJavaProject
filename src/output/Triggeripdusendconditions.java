package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Triggeripdusendconditions {

    
    
    protected ArrayList<TriggerIPduSendCondition> triggerIPduSendConditions;
    
    

    
    
    @XmlElement(name="TRIGGER-I-PDU-SEND-CONDITION")
    public ArrayList<TriggerIPduSendCondition> getTriggerIPduSendConditions() {
        return this.triggerIPduSendConditions;
    }

    public void setTriggerIPduSendConditions(ArrayList<TriggerIPduSendCondition> value) {
        this.triggerIPduSendConditions = value;
    }
    
    
}