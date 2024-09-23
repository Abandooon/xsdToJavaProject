package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Preconfiguredconfigurationrefs {

    
    
    protected ArrayList<PreconfiguredConfigurationRef> preconfiguredConfigurationRefs;
    
    

    
    
    @XmlElement(name="PRECONFIGURED-CONFIGURATION-REF")
    public ArrayList<PreconfiguredConfigurationRef> getPreconfiguredConfigurationRefs() {
        return this.preconfiguredConfigurationRefs;
    }

    public void setPreconfiguredConfigurationRefs(ArrayList<PreconfiguredConfigurationRef> value) {
        this.preconfiguredConfigurationRefs = value;
    }
    
    
}