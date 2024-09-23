package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pducounters {

    
    
    protected ArrayList<SignalIPduCounter> signalIPduCounters;
    
    

    
    
    @XmlElement(name="SIGNAL-I-PDU-COUNTER")
    public ArrayList<SignalIPduCounter> getSignalIPduCounters() {
        return this.signalIPduCounters;
    }

    public void setSignalIPduCounters(ArrayList<SignalIPduCounter> value) {
        this.signalIPduCounters = value;
    }
    
    
}