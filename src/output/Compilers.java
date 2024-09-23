package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Compilers {

    
    
    protected ArrayList<Compiler> compilers;
    
    

    
    
    @XmlElement(name="COMPILER")
    public ArrayList<Compiler> getCompilers() {
        return this.compilers;
    }

    public void setCompilers(ArrayList<Compiler> value) {
        this.compilers = value;
    }
    
    
}