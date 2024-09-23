package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedclientserverentrys {

    
    
    protected ArrayList<BswModuleClientServerEntry> bswModuleClientServerEntrys;
    
    

    
    
    @XmlElement(name="BSW-MODULE-CLIENT-SERVER-ENTRY")
    public ArrayList<BswModuleClientServerEntry> getBswModuleClientServerEntrys() {
        return this.bswModuleClientServerEntrys;
    }

    public void setBswModuleClientServerEntrys(ArrayList<BswModuleClientServerEntry> value) {
        this.bswModuleClientServerEntrys = value;
    }
    
    
}