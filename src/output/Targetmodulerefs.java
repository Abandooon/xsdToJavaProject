package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetmodulerefs {

    
    
    protected ArrayList<BswModuleDescriptionRefConditional> bswModuleDescriptionRefConditionals;
    
    

    
    
    @XmlElement(name="BSW-MODULE-DESCRIPTION-REF-CONDITIONAL")
    public ArrayList<BswModuleDescriptionRefConditional> getBswModuleDescriptionRefConditionals() {
        return this.bswModuleDescriptionRefConditionals;
    }

    public void setBswModuleDescriptionRefConditionals(ArrayList<BswModuleDescriptionRefConditional> value) {
        this.bswModuleDescriptionRefConditionals = value;
    }
    
    
}