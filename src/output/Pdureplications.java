package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pdureplications {

    
    
    protected ArrayList<SignalIPduReplication> signalIPduReplications;
    
    

    
    
    @XmlElement(name="SIGNAL-I-PDU-REPLICATION")
    public ArrayList<SignalIPduReplication> getSignalIPduReplications() {
        return this.signalIPduReplications;
    }

    public void setSignalIPduReplications(ArrayList<SignalIPduReplication> value) {
        this.signalIPduReplications = value;
    }
    
    
}