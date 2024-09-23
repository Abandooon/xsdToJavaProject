package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Options {

    
    
    protected ArrayList<Identifier> options;
    
    

    
    
    @XmlElement(name="OPTION")
    public ArrayList<Identifier> getOptions() {
        return this.options;
    }

    public void setOptions(ArrayList<Identifier> value) {
        this.options = value;
    }
    
    
}