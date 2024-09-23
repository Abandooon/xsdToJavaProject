package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucmoduleconfigurationvaluesref extends Ref {

    
    
    protected EcucModuleConfigurationValuesSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucModuleConfigurationValuesSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucModuleConfigurationValuesSubtypesEnum value) {
        this.dest = value;
    }
    
    
}