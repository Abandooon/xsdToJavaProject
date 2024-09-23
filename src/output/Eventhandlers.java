package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Eventhandlers {

    
    
    protected ArrayList<EventHandler> eventHandlers;
    
    

    
    
    @XmlElement(name="EVENT-HANDLER")
    public ArrayList<EventHandler> getEventHandlers() {
        return this.eventHandlers;
    }

    public void setEventHandlers(ArrayList<EventHandler> value) {
        this.eventHandlers = value;
    }
    
    
}