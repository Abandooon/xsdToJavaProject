package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rteeventirefs {

    
    
    protected ArrayList<RteEventInEcuInstanceRef> rteEventIrefs;
    
    

    
    
    @XmlElement(name="RTE-EVENT-IREF")
    public ArrayList<RteEventInEcuInstanceRef> getRteEventIrefs() {
        return this.rteEventIrefs;
    }

    public void setRteEventIrefs(ArrayList<RteEventInEcuInstanceRef> value) {
        this.rteEventIrefs = value;
    }
    
    
}