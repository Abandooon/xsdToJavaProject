package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Supportedconfigvariants {

    
    
    protected ArrayList<EcucConfigurationVariantEnum> supportedConfigVariants;
    
    

    
    
    @XmlElement(name="SUPPORTED-CONFIG-VARIANT")
    public ArrayList<EcucConfigurationVariantEnum> getSupportedConfigVariants() {
        return this.supportedConfigVariants;
    }

    public void setSupportedConfigVariants(ArrayList<EcucConfigurationVariantEnum> value) {
        this.supportedConfigVariants = value;
    }
    
    
}