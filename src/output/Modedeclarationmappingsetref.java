package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Modedeclarationmappingsetref extends Ref {

    
    
    protected ModeDeclarationMappingSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationMappingSetSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ModeDeclarationMappingSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}