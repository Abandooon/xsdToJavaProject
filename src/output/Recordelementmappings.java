package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Recordelementmappings {

    
    
    protected ArrayList<SenderRecRecordElementMapping> senderRecRecordElementMappings;
    
    

    
    
    @XmlElement(name="SENDER-REC-RECORD-ELEMENT-MAPPING")
    public ArrayList<SenderRecRecordElementMapping> getSenderRecRecordElementMappings() {
        return this.senderRecRecordElementMappings;
    }

    public void setSenderRecRecordElementMappings(ArrayList<SenderRecRecordElementMapping> value) {
        this.senderRecRecordElementMappings = value;
    }
    
    
}