package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Complextypemapping {

    
    
    protected SenderRecArrayTypeMapping senderRecArrayTypeMapping;
    
    
    
    protected SenderRecRecordTypeMapping senderRecRecordTypeMapping;
    
    

    
    
    @XmlElement(name="SENDER-REC-ARRAY-TYPE-MAPPING")
    public SenderRecArrayTypeMapping getSenderRecArrayTypeMapping() {
        return this.senderRecArrayTypeMapping;
    }

    public void setSenderRecArrayTypeMapping(SenderRecArrayTypeMapping value) {
        this.senderRecArrayTypeMapping = value;
    }
    
    
    
    @XmlElement(name="SENDER-REC-RECORD-TYPE-MAPPING")
    public SenderRecRecordTypeMapping getSenderRecRecordTypeMapping() {
        return this.senderRecRecordTypeMapping;
    }

    public void setSenderRecRecordTypeMapping(SenderRecRecordTypeMapping value) {
        this.senderRecRecordTypeMapping = value;
    }
    
    
}