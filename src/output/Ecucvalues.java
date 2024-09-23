package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucvalues {

    
    
    protected ArrayList<EcucModuleConfigurationValuesRefConditional> ecucModuleConfigurationValuesRefConditionals;
    
    

    
    
    @XmlElement(name="ECUC-MODULE-CONFIGURATION-VALUES-REF-CONDITIONAL")
    public ArrayList<EcucModuleConfigurationValuesRefConditional> getEcucModuleConfigurationValuesRefConditionals() {
        return this.ecucModuleConfigurationValuesRefConditionals;
    }

    public void setEcucModuleConfigurationValuesRefConditionals(ArrayList<EcucModuleConfigurationValuesRefConditional> value) {
        this.ecucModuleConfigurationValuesRefConditionals = value;
    }
    
    
}