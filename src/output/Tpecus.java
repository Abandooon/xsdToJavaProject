package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpecus {

    
    
    protected ArrayList<CanTpEcu> canTpEcus;
    
    

    
    
    @XmlElement(name="CAN-TP-ECU")
    public ArrayList<CanTpEcu> getCanTpEcus() {
        return this.canTpEcus;
    }

    public void setCanTpEcus(ArrayList<CanTpEcu> value) {
        this.canTpEcus = value;
    }
    
    
}