package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Outgoingcallbacks {

    
    
    protected ArrayList<BswModuleEntryRefConditional> bswModuleEntryRefConditionals;
    
    

    
    
    @XmlElement(name="BSW-MODULE-ENTRY-REF-CONDITIONAL")
    public ArrayList<BswModuleEntryRefConditional> getBswModuleEntryRefConditionals() {
        return this.bswModuleEntryRefConditionals;
    }

    public void setBswModuleEntryRefConditionals(ArrayList<BswModuleEntryRefConditional> value) {
        this.bswModuleEntryRefConditionals = value;
    }
    
    
}