package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Possibleerrors {

    
    
    protected ArrayList<ApplicationError> applicationErrors;
    
    

    
    
    @XmlElement(name="APPLICATION-ERROR")
    public ArrayList<ApplicationError> getApplicationErrors() {
        return this.applicationErrors;
    }

    public void setApplicationErrors(ArrayList<ApplicationError> value) {
        this.applicationErrors = value;
    }
    
    
}