package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Npdurefs {

    
    
    protected ArrayList<NPduRef> nPduRefs;
    
    

    
    
    @XmlElement(name="N-PDU-REF")
    public ArrayList<NPduRef> getNPduRefs() {
        return this.nPduRefs;
    }

    public void setNPduRefs(ArrayList<NPduRef> value) {
        this.nPduRefs = value;
    }
    
    
}