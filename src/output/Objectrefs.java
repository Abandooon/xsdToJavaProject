package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Objectrefs {

    
    
    protected ArrayList<ObjectRef> objectRefs;
    
    

    
    
    @XmlElement(name="OBJECT-REF")
    public ArrayList<ObjectRef> getObjectRefs() {
        return this.objectRefs;
    }

    public void setObjectRefs(ArrayList<ObjectRef> value) {
        this.objectRefs = value;
    }
    
    
}