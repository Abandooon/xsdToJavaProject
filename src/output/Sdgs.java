package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sdgs {

    
    
    protected ArrayList<Sdg> sdgs;
    
    

    
    
    @XmlElement(name="SDG")
    public ArrayList<Sdg> getSdgs() {
        return this.sdgs;
    }

    public void setSdgs(ArrayList<Sdg> value) {
        this.sdgs = value;
    }
    
    
}