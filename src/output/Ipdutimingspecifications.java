package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ipdutimingspecifications {

    
    
    protected ArrayList<IPduTiming> iPduTimings;
    
    

    
    
    @XmlElement(name="I-PDU-TIMING")
    public ArrayList<IPduTiming> getIPduTimings() {
        return this.iPduTimings;
    }

    public void setIPduTimings(ArrayList<IPduTiming> value) {
        this.iPduTimings = value;
    }
    
    
}