package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Useinsteadrefs {

    
    
    protected ArrayList<UseInsteadRef> useInsteadRefs;
    
    

    
    
    @XmlElement(name="USE-INSTEAD-REF")
    public ArrayList<UseInsteadRef> getUseInsteadRefs() {
        return this.useInsteadRefs;
    }

    public void setUseInsteadRefs(ArrayList<UseInsteadRef> value) {
        this.useInsteadRefs = value;
    }
    
    
}