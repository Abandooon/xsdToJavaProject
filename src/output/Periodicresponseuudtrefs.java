package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Periodicresponseuudtrefs {

    
    
    protected ArrayList<PeriodicResponseUudtRef> periodicResponseUudtRefs;
    
    

    
    
    @XmlElement(name="PERIODIC-RESPONSE-UUDT-REF")
    public ArrayList<PeriodicResponseUudtRef> getPeriodicResponseUudtRefs() {
        return this.periodicResponseUudtRefs;
    }

    public void setPeriodicResponseUudtRefs(ArrayList<PeriodicResponseUudtRef> value) {
        this.periodicResponseUudtRefs = value;
    }
    
    
}