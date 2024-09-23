package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Minimumdistances {

    
    
    protected ArrayList<MultidimensionalTime> timeValues;
    
    

    
    
    @XmlElement(name="TIME-VALUE")
    public ArrayList<MultidimensionalTime> getTimeValues() {
        return this.timeValues;
    }

    public void setTimeValues(ArrayList<MultidimensionalTime> value) {
        this.timeValues = value;
    }
    
    
}