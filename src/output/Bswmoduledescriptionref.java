package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswmoduledescriptionref extends Ref {

    
    
    protected BswModuleDescriptionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleDescriptionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswModuleDescriptionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}