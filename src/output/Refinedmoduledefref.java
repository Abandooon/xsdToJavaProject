package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Refinedmoduledefref extends Ref {

    
    
    protected EcucModuleDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucModuleDefSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucModuleDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}