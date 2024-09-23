package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transmitpdurefs {

    
    
    protected ArrayList<TransmitPduRef> transmitPduRefs;
    
    

    
    
    @XmlElement(name="TRANSMIT-PDU-REF")
    public ArrayList<TransmitPduRef> getTransmitPduRefs() {
        return this.transmitPduRefs;
    }

    public void setTransmitPduRefs(ArrayList<TransmitPduRef> value) {
        this.transmitPduRefs = value;
    }
    
    
}