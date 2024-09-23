package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valueconfigclasses {

    
    
    protected ArrayList<EcucValueConfigurationClass> ecucValueConfigurationClasss;
    
    

    
    
    @XmlElement(name="ECUC-VALUE-CONFIGURATION-CLASS")
    public ArrayList<EcucValueConfigurationClass> getEcucValueConfigurationClasss() {
        return this.ecucValueConfigurationClasss;
    }

    public void setEcucValueConfigurationClasss(ArrayList<EcucValueConfigurationClass> value) {
        this.ecucValueConfigurationClasss = value;
    }
    
    
}