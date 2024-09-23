package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Objectdefintionrefs {

    
    
    protected ArrayList<ObjectDefintionRef> objectDefintionRefs;
    
    

    
    
    @XmlElement(name="OBJECT-DEFINTION-REF")
    public ArrayList<ObjectDefintionRef> getObjectDefintionRefs() {
        return this.objectDefintionRefs;
    }

    public void setObjectDefintionRefs(ArrayList<ObjectDefintionRef> value) {
        this.objectDefintionRefs = value;
    }
    
    
}