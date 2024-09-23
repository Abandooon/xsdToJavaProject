package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Containedisignalipdugrouprefs {

    
    
    protected ArrayList<ContainedISignalIPduGroupRef> containedISignalIPduGroupRefs;
    
    

    
    
    @XmlElement(name="CONTAINED-I-SIGNAL-I-PDU-GROUP-REF")
    public ArrayList<ContainedISignalIPduGroupRef> getContainedISignalIPduGroupRefs() {
        return this.containedISignalIPduGroupRefs;
    }

    public void setContainedISignalIPduGroupRefs(ArrayList<ContainedISignalIPduGroupRef> value) {
        this.containedISignalIPduGroupRefs = value;
    }
    
    
}