package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Texttablemappings {

    
    
    protected ArrayList<TextTableMapping> textTableMappings;
    
    

    
    
    @XmlElement(name="TEXT-TABLE-MAPPING")
    public ArrayList<TextTableMapping> getTextTableMappings() {
        return this.textTableMappings;
    }

    public void setTextTableMappings(ArrayList<TextTableMapping> value) {
        this.textTableMappings = value;
    }
    
    
}