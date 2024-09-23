package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swsystemconstantvaluesetrefs {

    
    
    protected ArrayList<SwSystemconstantValueSetRef> swSystemconstantValueSetRefs;
    
    

    
    
    @XmlElement(name="SW-SYSTEMCONSTANT-VALUE-SET-REF")
    public ArrayList<SwSystemconstantValueSetRef> getSwSystemconstantValueSetRefs() {
        return this.swSystemconstantValueSetRefs;
    }

    public void setSwSystemconstantValueSetRefs(ArrayList<SwSystemconstantValueSetRef> value) {
        this.swSystemconstantValueSetRefs = value;
    }
    
    
}