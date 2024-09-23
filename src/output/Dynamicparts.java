package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dynamicparts {

    
    
    protected ArrayList<DynamicPart> dynamicParts;
    
    

    
    
    @XmlElement(name="DYNAMIC-PART")
    public ArrayList<DynamicPart> getDynamicParts() {
        return this.dynamicParts;
    }

    public void setDynamicParts(ArrayList<DynamicPart> value) {
        this.dynamicParts = value;
    }
    
    
}