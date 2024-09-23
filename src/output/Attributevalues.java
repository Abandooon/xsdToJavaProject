package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Attributevalues {

    
    
    protected ArrayList<FmAttributeValue> fmAttributeValues;
    
    

    
    
    @XmlElement(name="FM-ATTRIBUTE-VALUE")
    public ArrayList<FmAttributeValue> getFmAttributeValues() {
        return this.fmAttributeValues;
    }

    public void setFmAttributeValues(ArrayList<FmAttributeValue> value) {
        this.fmAttributeValues = value;
    }
    
    
}