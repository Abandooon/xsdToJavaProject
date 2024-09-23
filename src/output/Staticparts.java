package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Staticparts {

    
    
    protected ArrayList<StaticPart> staticParts;
    
    

    
    
    @XmlElement(name="STATIC-PART")
    public ArrayList<StaticPart> getStaticParts() {
        return this.staticParts;
    }

    public void setStaticParts(ArrayList<StaticPart> value) {
        this.staticParts = value;
    }
    
    
}