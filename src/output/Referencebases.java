package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Referencebases {

    
    
    protected ArrayList<ReferenceBase> referenceBases;
    
    

    
    
    @XmlElement(name="REFERENCE-BASE")
    public ArrayList<ReferenceBase> getReferenceBases() {
        return this.referenceBases;
    }

    public void setReferenceBases(ArrayList<ReferenceBase> value) {
        this.referenceBases = value;
    }
    
    
}