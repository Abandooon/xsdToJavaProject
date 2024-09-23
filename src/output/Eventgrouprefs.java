package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Eventgrouprefs {

    
    
    protected ArrayList<EventGroupRef> eventGroupRefs;
    
    

    
    
    @XmlElement(name="EVENT-GROUP-REF")
    public ArrayList<EventGroupRef> getEventGroupRefs() {
        return this.eventGroupRefs;
    }

    public void setEventGroupRefs(ArrayList<EventGroupRef> value) {
        this.eventGroupRefs = value;
    }
    
    
}