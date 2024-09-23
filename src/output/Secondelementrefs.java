package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Secondelementrefs {

    
    
    protected ArrayList<SecondElementRef> secondElementRefs;
    
    

    
    
    @XmlElement(name="SECOND-ELEMENT-REF")
    public ArrayList<SecondElementRef> getSecondElementRefs() {
        return this.secondElementRefs;
    }

    public void setSecondElementRefs(ArrayList<SecondElementRef> value) {
        this.secondElementRefs = value;
    }
    
    
}