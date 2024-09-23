package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuinstancerefs {

    
    
    protected ArrayList<EcuInstanceRef> ecuInstanceRefs;
    
    

    
    
    @XmlElement(name="ECU-INSTANCE-REF")
    public ArrayList<EcuInstanceRef> getEcuInstanceRefs() {
        return this.ecuInstanceRefs;
    }

    public void setEcuInstanceRefs(ArrayList<EcuInstanceRef> value) {
        this.ecuInstanceRefs = value;
    }
    
    
}