package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Macmulticastaddressrefs {

    
    
    protected ArrayList<MacMulticastAddressRef> macMulticastAddressRefs;
    
    

    
    
    @XmlElement(name="MAC-MULTICAST-ADDRESS-REF")
    public ArrayList<MacMulticastAddressRef> getMacMulticastAddressRefs() {
        return this.macMulticastAddressRefs;
    }

    public void setMacMulticastAddressRefs(ArrayList<MacMulticastAddressRef> value) {
        this.macMulticastAddressRefs = value;
    }
    
    
}