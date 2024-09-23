package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bytevalues {

    
    
    protected ArrayList<Integer> byteValues;
    
    

    
    
    @XmlElement(name="BYTE-VALUE")
    public ArrayList<Integer> getByteValues() {
        return this.byteValues;
    }

    public void setByteValues(ArrayList<Integer> value) {
        this.byteValues = value;
    }
    
    
}