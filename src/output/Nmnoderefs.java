package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmnoderefs {

    
    
    protected ArrayList<NmNodeRef> nmNodeRefs;
    
    

    
    
    @XmlElement(name="NM-NODE-REF")
    public ArrayList<NmNodeRef> getNmNodeRefs() {
        return this.nmNodeRefs;
    }

    public void setNmNodeRefs(ArrayList<NmNodeRef> value) {
        this.nmNodeRefs = value;
    }
    
    
}