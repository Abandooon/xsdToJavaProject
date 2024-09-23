package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Servicedependencys {

    
    
    protected ArrayList<SwcServiceDependency> swcServiceDependencys;
    
    

    
    
    @XmlElement(name="SWC-SERVICE-DEPENDENCY")
    public ArrayList<SwcServiceDependency> getSwcServiceDependencys() {
        return this.swcServiceDependencys;
    }

    public void setSwcServiceDependencys(ArrayList<SwcServiceDependency> value) {
        this.swcServiceDependencys = value;
    }
    
    
}