package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Signals {

    
    
    protected ArrayList<SwcToSwcSignal> swcToSwcSignals;
    
    

    
    
    @XmlElement(name="SWC-TO-SWC-SIGNAL")
    public ArrayList<SwcToSwcSignal> getSwcToSwcSignals() {
        return this.swcToSwcSignals;
    }

    public void setSwcToSwcSignals(ArrayList<SwcToSwcSignal> value) {
        this.swcToSwcSignals = value;
    }
    
    
}