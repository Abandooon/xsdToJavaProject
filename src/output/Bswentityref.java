package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Bswentityref extends Ref {

    
    
    protected BswModuleEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleEntitySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswModuleEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}