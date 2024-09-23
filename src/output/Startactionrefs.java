package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Startactionrefs {

    
    
    protected ArrayList<StartActionRef> startActionRefs;
    
    

    
    
    @XmlElement(name="START-ACTION-REF")
    public ArrayList<StartActionRef> getStartActionRefs() {
        return this.startActionRefs;
    }

    public void setStartActionRefs(ArrayList<StartActionRef> value) {
        this.startActionRefs = value;
    }
    
    
}