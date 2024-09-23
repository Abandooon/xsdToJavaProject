package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Communicationclusterrefs {

    
    
    protected ArrayList<CommunicationClusterRef> communicationClusterRefs;
    
    

    
    
    @XmlElement(name="COMMUNICATION-CLUSTER-REF")
    public ArrayList<CommunicationClusterRef> getCommunicationClusterRefs() {
        return this.communicationClusterRefs;
    }

    public void setCommunicationClusterRefs(ArrayList<CommunicationClusterRef> value) {
        this.communicationClusterRefs = value;
    }
    
    
}