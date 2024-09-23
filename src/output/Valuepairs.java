package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valuepairs {

    
    
    protected ArrayList<TextTableValuePair> textTableValuePairs;
    
    

    
    
    @XmlElement(name="TEXT-TABLE-VALUE-PAIR")
    public ArrayList<TextTableValuePair> getTextTableValuePairs() {
        return this.textTableValuePairs;
    }

    public void setTextTableValuePairs(ArrayList<TextTableValuePair> value) {
        this.textTableValuePairs = value;
    }
    
    
}