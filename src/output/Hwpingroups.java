package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwpingroups {

    
    
    protected ArrayList<HwPinGroup> hwPinGroups;
    
    

    
    
    @XmlElement(name="HW-PIN-GROUP")
    public ArrayList<HwPinGroup> getHwPinGroups() {
        return this.hwPinGroups;
    }

    public void setHwPinGroups(ArrayList<HwPinGroup> value) {
        this.hwPinGroups = value;
    }
    
    
}