package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implementationconfigclasses {

    
    
    protected ArrayList<EcucImplementationConfigurationClass> ecucImplementationConfigurationClasss;
    
    

    
    
    @XmlElement(name="ECUC-IMPLEMENTATION-CONFIGURATION-CLASS")
    public ArrayList<EcucImplementationConfigurationClass> getEcucImplementationConfigurationClasss() {
        return this.ecucImplementationConfigurationClasss;
    }

    public void setEcucImplementationConfigurationClasss(ArrayList<EcucImplementationConfigurationClass> value) {
        this.ecucImplementationConfigurationClasss = value;
    }
    
    
}