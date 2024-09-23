package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Systemdocumentations {

    
    
    protected ArrayList<Chapter> chapters;
    
    

    
    
    @XmlElement(name="CHAPTER")
    public ArrayList<Chapter> getChapters() {
        return this.chapters;
    }

    public void setChapters(ArrayList<Chapter> value) {
        this.chapters = value;
    }
    
    
}