package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpaddressrefs {

    
    
    protected ArrayList<TpAddressRef> tpAddressRefs;
    
    

    
    
    @XmlElement(name="TP-ADDRESS-REF")
    public ArrayList<TpAddressRef> getTpAddressRefs() {
        return this.tpAddressRefs;
    }

    public void setTpAddressRefs(ArrayList<TpAddressRef> value) {
        this.tpAddressRefs = value;
    }
    
    
}