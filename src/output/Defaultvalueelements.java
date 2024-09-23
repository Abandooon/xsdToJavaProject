package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Defaultvalueelements {

    
    
    protected ArrayList<DefaultValueElement> defaultValueElements;
    
    

    
    
    @XmlElement(name="DEFAULT-VALUE-ELEMENT")
    public ArrayList<DefaultValueElement> getDefaultValueElements() {
        return this.defaultValueElements;
    }

    public void setDefaultValueElements(ArrayList<DefaultValueElement> value) {
        this.defaultValueElements = value;
    }
    
    
}