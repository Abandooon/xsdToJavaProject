package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Collectedinstanceirefs {

    
    
    protected ArrayList<AnyInstanceRef> collectedInstanceIrefs;
    
    

    
    
    @XmlElement(name="COLLECTED-INSTANCE-IREF")
    public ArrayList<AnyInstanceRef> getCollectedInstanceIrefs() {
        return this.collectedInstanceIrefs;
    }

    public void setCollectedInstanceIrefs(ArrayList<AnyInstanceRef> value) {
        this.collectedInstanceIrefs = value;
    }
    
    
}