package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Keywords {

    
    
    protected ArrayList<Keyword> keywords;
    
    

    
    
    @XmlElement(name="KEYWORD")
    public ArrayList<Keyword> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(ArrayList<Keyword> value) {
        this.keywords = value;
    }
    
    
}