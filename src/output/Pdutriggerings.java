package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pdutriggerings {

    
    
    protected ArrayList<PduTriggering> pduTriggerings;
    
    

    
    
    @XmlElement(name="PDU-TRIGGERING")
    public ArrayList<PduTriggering> getPduTriggerings() {
        return this.pduTriggerings;
    }

    public void setPduTriggerings(ArrayList<PduTriggering> value) {
        this.pduTriggerings = value;
    }
    
    
}