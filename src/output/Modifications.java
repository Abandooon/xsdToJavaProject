package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modifications {

    
    
    protected ArrayList<Modification> modifications;
    
    

    
    
    @XmlElement(name="MODIFICATION")
    public ArrayList<Modification> getModifications() {
        return this.modifications;
    }

    public void setModifications(ArrayList<Modification> value) {
        this.modifications = value;
    }
    
    
}