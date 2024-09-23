package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Compositetypemappings {

    
    
    protected ArrayList<ClientServerArrayTypeMapping> clientServerArrayTypeMappings;
    
    
    
    protected ArrayList<ClientServerRecordTypeMapping> clientServerRecordTypeMappings;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-ARRAY-TYPE-MAPPING")
    public ArrayList<ClientServerArrayTypeMapping> getClientServerArrayTypeMappings() {
        return this.clientServerArrayTypeMappings;
    }

    public void setClientServerArrayTypeMappings(ArrayList<ClientServerArrayTypeMapping> value) {
        this.clientServerArrayTypeMappings = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVER-RECORD-TYPE-MAPPING")
    public ArrayList<ClientServerRecordTypeMapping> getClientServerRecordTypeMappings() {
        return this.clientServerRecordTypeMappings;
    }

    public void setClientServerRecordTypeMappings(ArrayList<ClientServerRecordTypeMapping> value) {
        this.clientServerRecordTypeMappings = value;
    }
    
    
}