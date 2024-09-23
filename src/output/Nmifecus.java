package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmifecus {

    
    
    protected ArrayList<NmEcu> nmEcus;
    
    

    
    
    @XmlElement(name="NM-ECU")
    public ArrayList<NmEcu> getNmEcus() {
        return this.nmEcus;
    }

    public void setNmEcus(ArrayList<NmEcu> value) {
        this.nmEcus = value;
    }
    
    
}