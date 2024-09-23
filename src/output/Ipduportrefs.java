package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipduportrefs {

    
    
    protected ArrayList<IPduPortRef> iPduPortRefs;
    
    

    
    
    @XmlElement(name="I-PDU-PORT-REF")
    public ArrayList<IPduPortRef> getIPduPortRefs() {
        return this.iPduPortRefs;
    }

    public void setIPduPortRefs(ArrayList<IPduPortRef> value) {
        this.iPduPortRefs = value;
    }
    
    
}