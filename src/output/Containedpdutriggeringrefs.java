package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Containedpdutriggeringrefs {

    
    
    protected ArrayList<ContainedPduTriggeringRef> containedPduTriggeringRefs;
    
    

    
    
    @XmlElement(name="CONTAINED-PDU-TRIGGERING-REF")
    public ArrayList<ContainedPduTriggeringRef> getContainedPduTriggeringRefs() {
        return this.containedPduTriggeringRefs;
    }

    public void setContainedPduTriggeringRefs(ArrayList<ContainedPduTriggeringRef> value) {
        this.containedPduTriggeringRefs = value;
    }
    
    
}