package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pdutoframemappings {

    
    
    protected ArrayList<PduToFrameMapping> pduToFrameMappings;
    
    

    
    
    @XmlElement(name="PDU-TO-FRAME-MAPPING")
    public ArrayList<PduToFrameMapping> getPduToFrameMappings() {
        return this.pduToFrameMappings;
    }

    public void setPduToFrameMappings(ArrayList<PduToFrameMapping> value) {
        this.pduToFrameMappings = value;
    }
    
    
}