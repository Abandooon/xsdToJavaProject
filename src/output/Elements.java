package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Elements {

    
    
    protected ArrayList<ApplicationRecordElement> applicationRecordElements;
    
    

    
    
    @XmlElement(name="APPLICATION-RECORD-ELEMENT")
    public ArrayList<ApplicationRecordElement> getApplicationRecordElements() {
        return this.applicationRecordElements;
    }

    public void setApplicationRecordElements(ArrayList<ApplicationRecordElement> value) {
        this.applicationRecordElements = value;
    }
    
    
}