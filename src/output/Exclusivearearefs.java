package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Exclusivearearefs {

    
    
    protected ArrayList<ExclusiveAreaRef> exclusiveAreaRefs;
    
    

    
    
    @XmlElement(name="EXCLUSIVE-AREA-REF")
    public ArrayList<ExclusiveAreaRef> getExclusiveAreaRefs() {
        return this.exclusiveAreaRefs;
    }

    public void setExclusiveAreaRefs(ArrayList<ExclusiveAreaRef> value) {
        this.exclusiveAreaRefs = value;
    }
    
    
}