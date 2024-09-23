package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linkers {

    
    
    protected ArrayList<Linker> linkers;
    
    

    
    
    @XmlElement(name="LINKER")
    public ArrayList<Linker> getLinkers() {
        return this.linkers;
    }

    public void setLinkers(ArrayList<Linker> value) {
        this.linkers = value;
    }
    
    
}