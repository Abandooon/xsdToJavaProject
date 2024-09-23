package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Firstmoderefs {

    
    
    protected ArrayList<FirstModeRef> firstModeRefs;
    
    

    
    
    @XmlElement(name="FIRST-MODE-REF")
    public ArrayList<FirstModeRef> getFirstModeRefs() {
        return this.firstModeRefs;
    }

    public void setFirstModeRefs(ArrayList<FirstModeRef> value) {
        this.firstModeRefs = value;
    }
    
    
}