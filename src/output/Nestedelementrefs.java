package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nestedelementrefs {

    
    
    protected ArrayList<NestedElementRef> nestedElementRefs;
    
    

    
    
    @XmlElement(name="NESTED-ELEMENT-REF")
    public ArrayList<NestedElementRef> getNestedElementRefs() {
        return this.nestedElementRefs;
    }

    public void setNestedElementRefs(ArrayList<NestedElementRef> value) {
        this.nestedElementRefs = value;
    }
    
    
}