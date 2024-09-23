package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Consumedeventgrouprefs {

    
    
    protected ArrayList<ConsumedEventGroupRef> consumedEventGroupRefs;
    
    

    
    
    @XmlElement(name="CONSUMED-EVENT-GROUP-REF")
    public ArrayList<ConsumedEventGroupRef> getConsumedEventGroupRefs() {
        return this.consumedEventGroupRefs;
    }

    public void setConsumedEventGroupRefs(ArrayList<ConsumedEventGroupRef> value) {
        this.consumedEventGroupRefs = value;
    }
    
    
}