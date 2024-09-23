package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swgenericaxisparams {

    
    
    protected ArrayList<SwGenericAxisParam> swGenericAxisParams;
    
    

    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAM")
    public ArrayList<SwGenericAxisParam> getSwGenericAxisParams() {
        return this.swGenericAxisParams;
    }

    public void setSwGenericAxisParams(ArrayList<SwGenericAxisParam> value) {
        this.swGenericAxisParams = value;
    }
    
    
}