package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Usages {

    
    
    protected ArrayList<DependencyUsageEnum> usages;
    
    

    
    
    @XmlElement(name="USAGE")
    public ArrayList<DependencyUsageEnum> getUsages() {
        return this.usages;
    }

    public void setUsages(ArrayList<DependencyUsageEnum> value) {
        this.usages = value;
    }
    
    
}