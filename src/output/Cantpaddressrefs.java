package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Cantpaddressrefs {

    
    
    protected ArrayList<CanTpAddressRef> canTpAddressRefs;
    
    

    
    
    @XmlElement(name="CAN-TP-ADDRESS-REF")
    public ArrayList<CanTpAddressRef> getCanTpAddressRefs() {
        return this.canTpAddressRefs;
    }

    public void setCanTpAddressRefs(ArrayList<CanTpAddressRef> value) {
        this.canTpAddressRefs = value;
    }
    
    
}