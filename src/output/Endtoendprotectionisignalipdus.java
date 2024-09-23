package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Endtoendprotectionisignalipdus {

    
    
    protected ArrayList<EndToEndProtectionISignalIPdu> endToEndProtectionISignalIPdus;
    
    

    
    
    @XmlElement(name="END-TO-END-PROTECTION-I-SIGNAL-I-PDU")
    public ArrayList<EndToEndProtectionISignalIPdu> getEndToEndProtectionISignalIPdus() {
        return this.endToEndProtectionISignalIPdus;
    }

    public void setEndToEndProtectionISignalIPdus(ArrayList<EndToEndProtectionISignalIPdu> value) {
        this.endToEndProtectionISignalIPdus = value;
    }
    
    
}