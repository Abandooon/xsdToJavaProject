package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Eventhandlerrefs {

    
    
    protected ArrayList<EventHandlerRef> eventHandlerRefs;
    
    

    
    
    @XmlElement(name="EVENT-HANDLER-REF")
    public ArrayList<EventHandlerRef> getEventHandlerRefs() {
        return this.eventHandlerRefs;
    }

    public void setEventHandlerRefs(ArrayList<EventHandlerRef> value) {
        this.eventHandlerRefs = value;
    }
    
    
}