package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Deferringfidrefs {

    
    
    protected ArrayList<DeferringFidRef> deferringFidRefs;
    
    

    
    
    @XmlElement(name="DEFERRING-FID-REF")
    public ArrayList<DeferringFidRef> getDeferringFidRefs() {
        return this.deferringFidRefs;
    }

    public void setDeferringFidRefs(ArrayList<DeferringFidRef> value) {
        this.deferringFidRefs = value;
    }
    
    
}