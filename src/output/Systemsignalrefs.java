package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Systemsignalrefs {

    
    
    protected ArrayList<SystemSignalRef> systemSignalRefs;
    
    

    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public ArrayList<SystemSignalRef> getSystemSignalRefs() {
        return this.systemSignalRefs;
    }

    public void setSystemSignalRefs(ArrayList<SystemSignalRef> value) {
        this.systemSignalRefs = value;
    }
    
    
}