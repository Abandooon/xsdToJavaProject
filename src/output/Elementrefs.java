package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Elementrefs {

    
    
    protected ArrayList<ElementRef> elementRefs;
    
    

    
    
    @XmlElement(name="ELEMENT-REF")
    public ArrayList<ElementRef> getElementRefs() {
        return this.elementRefs;
    }

    public void setElementRefs(ArrayList<ElementRef> value) {
        this.elementRefs = value;
    }
    
    
}