package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Multiplicityconfigclasses {

    
    
    protected ArrayList<EcucMultiplicityConfigurationClass> ecucMultiplicityConfigurationClasss;
    
    

    
    
    @XmlElement(name="ECUC-MULTIPLICITY-CONFIGURATION-CLASS")
    public ArrayList<EcucMultiplicityConfigurationClass> getEcucMultiplicityConfigurationClasss() {
        return this.ecucMultiplicityConfigurationClasss;
    }

    public void setEcucMultiplicityConfigurationClasss(ArrayList<EcucMultiplicityConfigurationClass> value) {
        this.ecucMultiplicityConfigurationClasss = value;
    }
    
    
}