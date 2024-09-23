package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Firstelementrefs {

    
    
    protected ArrayList<FirstElementRef> firstElementRefs;
    
    

    
    
    @XmlElement(name="FIRST-ELEMENT-REF")
    public ArrayList<FirstElementRef> getFirstElementRefs() {
        return this.firstElementRefs;
    }

    public void setFirstElementRefs(ArrayList<FirstElementRef> value) {
        this.firstElementRefs = value;
    }
    
    
}