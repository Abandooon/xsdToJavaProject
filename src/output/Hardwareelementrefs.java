package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hardwareelementrefs {

    
    
    protected ArrayList<HardwareElementRef> hardwareElementRefs;
    
    

    
    
    @XmlElement(name="HARDWARE-ELEMENT-REF")
    public ArrayList<HardwareElementRef> getHardwareElementRefs() {
        return this.hardwareElementRefs;
    }

    public void setHardwareElementRefs(ArrayList<HardwareElementRef> value) {
        this.hardwareElementRefs = value;
    }
    
    
}