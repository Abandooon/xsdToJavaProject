package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Hwattributevalues {

    
    
    protected ArrayList<HwAttributeValue> hwAttributeValues;
    
    

    
    
    @XmlElement(name="HW-ATTRIBUTE-VALUE")
    public ArrayList<HwAttributeValue> getHwAttributeValues() {
        return this.hwAttributeValues;
    }

    public void setHwAttributeValues(ArrayList<HwAttributeValue> value) {
        this.hwAttributeValues = value;
    }
    
    
}