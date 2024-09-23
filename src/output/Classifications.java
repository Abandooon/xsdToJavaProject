package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Classifications {

    
    
    protected ArrayList<NmtokenString> classifications;
    
    

    
    
    @XmlElement(name="CLASSIFICATION")
    public ArrayList<NmtokenString> getClassifications() {
        return this.classifications;
    }

    public void setClassifications(ArrayList<NmtokenString> value) {
        this.classifications = value;
    }
    
    
}