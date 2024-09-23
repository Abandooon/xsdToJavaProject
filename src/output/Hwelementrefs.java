package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwelementrefs {

    
    
    protected ArrayList<HwElementRef> hwElementRefs;
    
    

    
    
    @XmlElement(name="HW-ELEMENT-REF")
    public ArrayList<HwElementRef> getHwElementRefs() {
        return this.hwElementRefs;
    }

    public void setHwElementRefs(ArrayList<HwElementRef> value) {
        this.hwElementRefs = value;
    }
    
    
}