package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Codedescriptors {

    
    
    protected ArrayList<Code> codes;
    
    

    
    
    @XmlElement(name="CODE")
    public ArrayList<Code> getCodes() {
        return this.codes;
    }

    public void setCodes(ArrayList<Code> value) {
        this.codes = value;
    }
    
    
}