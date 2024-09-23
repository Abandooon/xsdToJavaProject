package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwattributedefs {

    
    
    protected ArrayList<HwAttributeDef> hwAttributeDefs;
    
    

    
    
    @XmlElement(name="HW-ATTRIBUTE-DEF")
    public ArrayList<HwAttributeDef> getHwAttributeDefs() {
        return this.hwAttributeDefs;
    }

    public void setHwAttributeDefs(ArrayList<HwAttributeDef> value) {
        this.hwAttributeDefs = value;
    }
    
    
}