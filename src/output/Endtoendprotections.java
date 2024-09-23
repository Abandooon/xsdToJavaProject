package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Endtoendprotections {

    
    
    protected ArrayList<EndToEndProtection> endToEndProtections;
    
    

    
    
    @XmlElement(name="END-TO-END-PROTECTION")
    public ArrayList<EndToEndProtection> getEndToEndProtections() {
        return this.endToEndProtections;
    }

    public void setEndToEndProtections(ArrayList<EndToEndProtection> value) {
        this.endToEndProtections = value;
    }
    
    
}