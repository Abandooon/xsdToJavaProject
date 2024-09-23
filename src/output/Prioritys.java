package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Prioritys {

    
    
    protected ArrayList<PositiveInteger> prioritys;
    
    

    
    
    @XmlElement(name="PRIORITY")
    public ArrayList<PositiveInteger> getPrioritys() {
        return this.prioritys;
    }

    public void setPrioritys(ArrayList<PositiveInteger> value) {
        this.prioritys = value;
    }
    
    
}