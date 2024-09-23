package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Globalelements {

    
    
    protected ArrayList<ReferrableSubtypesEnum> globalElements;
    
    

    
    
    @XmlElement(name="GLOBAL-ELEMENT")
    public ArrayList<ReferrableSubtypesEnum> getGlobalElements() {
        return this.globalElements;
    }

    public void setGlobalElements(ArrayList<ReferrableSubtypesEnum> value) {
        this.globalElements = value;
    }
    
    
}