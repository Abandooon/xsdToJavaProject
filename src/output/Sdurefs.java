package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sdurefs {

    
    
    protected ArrayList<SduRef> sduRefs;
    
    

    
    
    @XmlElement(name="SDU-REF")
    public ArrayList<SduRef> getSduRefs() {
        return this.sduRefs;
    }

    public void setSduRefs(ArrayList<SduRef> value) {
        this.sduRefs = value;
    }
    
    
}