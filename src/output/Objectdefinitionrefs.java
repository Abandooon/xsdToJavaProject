package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Objectdefinitionrefs {

    
    
    protected ArrayList<ObjectDefinitionRef> objectDefinitionRefs;
    
    

    
    
    @XmlElement(name="OBJECT-DEFINITION-REF")
    public ArrayList<ObjectDefinitionRef> getObjectDefinitionRefs() {
        return this.objectDefinitionRefs;
    }

    public void setObjectDefinitionRefs(ArrayList<ObjectDefinitionRef> value) {
        this.objectDefinitionRefs = value;
    }
    
    
}