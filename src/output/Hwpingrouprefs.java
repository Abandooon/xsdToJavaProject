package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwpingrouprefs {

    
    
    protected ArrayList<HwPinGroupRef> hwPinGroupRefs;
    
    

    
    
    @XmlElement(name="HW-PIN-GROUP-REF")
    public ArrayList<HwPinGroupRef> getHwPinGroupRefs() {
        return this.hwPinGroupRefs;
    }

    public void setHwPinGroupRefs(ArrayList<HwPinGroupRef> value) {
        this.hwPinGroupRefs = value;
    }
    
    
}