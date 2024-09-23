package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetrefs {

    
    
    protected ArrayList<TargetRef> targetRefs;
    
    

    
    
    @XmlElement(name="TARGET-REF")
    public ArrayList<TargetRef> getTargetRefs() {
        return this.targetRefs;
    }

    public void setTargetRefs(ArrayList<TargetRef> value) {
        this.targetRefs = value;
    }
    
    
}