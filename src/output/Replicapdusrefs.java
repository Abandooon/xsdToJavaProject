package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Replicapdusrefs {

    
    
    protected ArrayList<ReplicaPdusRef> replicaPdusRefs;
    
    

    
    
    @XmlElement(name="REPLICA-PDUS-REF")
    public ArrayList<ReplicaPdusRef> getReplicaPdusRefs() {
        return this.replicaPdusRefs;
    }

    public void setReplicaPdusRefs(ArrayList<ReplicaPdusRef> value) {
        this.replicaPdusRefs = value;
    }
    
    
}