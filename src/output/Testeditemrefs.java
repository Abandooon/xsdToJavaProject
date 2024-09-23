package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Testeditemrefs {

    
    
    protected ArrayList<TestedItemRef> testedItemRefs;
    
    

    
    
    @XmlElement(name="TESTED-ITEM-REF")
    public ArrayList<TestedItemRef> getTestedItemRefs() {
        return this.testedItemRefs;
    }

    public void setTestedItemRefs(ArrayList<TestedItemRef> value) {
        this.testedItemRefs = value;
    }
    
    
}