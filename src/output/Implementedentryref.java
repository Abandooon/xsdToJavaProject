package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Implementedentryref extends Ref {

    
    
    protected BswModuleEntrySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleEntrySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswModuleEntrySubtypesEnum value) {
        this.dest = value;
    }
    
    
}