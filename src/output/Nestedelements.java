package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nestedelements {

    
    
    protected ArrayList<HwElementRefConditional> hwElementRefConditionals;
    
    

    
    
    @XmlElement(name="HW-ELEMENT-REF-CONDITIONAL")
    public ArrayList<HwElementRefConditional> getHwElementRefConditionals() {
        return this.hwElementRefConditionals;
    }

    public void setHwElementRefConditionals(ArrayList<HwElementRefConditional> value) {
        this.hwElementRefConditionals = value;
    }
    
    
}