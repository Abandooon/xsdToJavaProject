package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswmoduledependencys {

    
    
    protected ArrayList<BswModuleDependency> bswModuleDependencys;
    
    

    
    
    @XmlElement(name="BSW-MODULE-DEPENDENCY")
    public ArrayList<BswModuleDependency> getBswModuleDependencys() {
        return this.bswModuleDependencys;
    }

    public void setBswModuleDependencys(ArrayList<BswModuleDependency> value) {
        this.bswModuleDependencys = value;
    }
    
    
}