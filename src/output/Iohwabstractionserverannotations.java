package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Iohwabstractionserverannotations {

    
    
    protected ArrayList<IoHwAbstractionServerAnnotation> ioHwAbstractionServerAnnotations;
    
    

    
    
    @XmlElement(name="IO-HW-ABSTRACTION-SERVER-ANNOTATION")
    public ArrayList<IoHwAbstractionServerAnnotation> getIoHwAbstractionServerAnnotations() {
        return this.ioHwAbstractionServerAnnotations;
    }

    public void setIoHwAbstractionServerAnnotations(ArrayList<IoHwAbstractionServerAnnotation> value) {
        this.ioHwAbstractionServerAnnotations = value;
    }
    
    
}