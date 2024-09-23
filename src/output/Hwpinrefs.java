package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwpinrefs {

    
    
    protected ArrayList<HwPinRef> hwPinRefs;
    
    

    
    
    @XmlElement(name="HW-PIN-REF")
    public ArrayList<HwPinRef> getHwPinRefs() {
        return this.hwPinRefs;
    }

    public void setHwPinRefs(ArrayList<HwPinRef> value) {
        this.hwPinRefs = value;
    }
    
    
}