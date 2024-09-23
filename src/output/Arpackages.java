package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Arpackages {

    
    
    protected ArrayList<ArPackage> arPackages;
    
    

    
    
    @XmlElement(name="AR-PACKAGE")
    public ArrayList<ArPackage> getArPackages() {
        return this.arPackages;
    }

    public void setArPackages(ArrayList<ArPackage> value) {
        this.arPackages = value;
    }
    
    
}