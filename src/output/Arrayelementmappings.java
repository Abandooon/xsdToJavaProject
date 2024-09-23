package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Arrayelementmappings {

    
    
    protected ArrayList<SenderRecArrayElementMapping> senderRecArrayElementMappings;
    
    

    
    
    @XmlElement(name="SENDER-REC-ARRAY-ELEMENT-MAPPING")
    public ArrayList<SenderRecArrayElementMapping> getSenderRecArrayElementMappings() {
        return this.senderRecArrayElementMappings;
    }

    public void setSenderRecArrayElementMappings(ArrayList<SenderRecArrayElementMapping> value) {
        this.senderRecArrayElementMappings = value;
    }
    
    
}