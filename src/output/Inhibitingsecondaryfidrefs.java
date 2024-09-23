package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Inhibitingsecondaryfidrefs {

    
    
    protected ArrayList<InhibitingSecondaryFidRef> inhibitingSecondaryFidRefs;
    
    

    
    
    @XmlElement(name="INHIBITING-SECONDARY-FID-REF")
    public ArrayList<InhibitingSecondaryFidRef> getInhibitingSecondaryFidRefs() {
        return this.inhibitingSecondaryFidRefs;
    }

    public void setInhibitingSecondaryFidRefs(ArrayList<InhibitingSecondaryFidRef> value) {
        this.inhibitingSecondaryFidRefs = value;
    }
    
    
}