package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextmodedeclarationgroupref extends Ref {

    
    
    protected ModeDeclarationGroupPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationGroupPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ModeDeclarationGroupPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}