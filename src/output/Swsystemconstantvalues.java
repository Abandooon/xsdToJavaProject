package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swsystemconstantvalues {

    
    
    protected ArrayList<SwSystemconstValue> swSystemconstValues;
    
    

    
    
    @XmlElement(name="SW-SYSTEMCONST-VALUE")
    public ArrayList<SwSystemconstValue> getSwSystemconstValues() {
        return this.swSystemconstValues;
    }

    public void setSwSystemconstValues(ArrayList<SwSystemconstValue> value) {
        this.swSystemconstValues = value;
    }
    
    
}