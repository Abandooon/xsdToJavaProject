package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedrequiredinterfacetref extends Ref {

    
    
    protected PortInterfaceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortInterfaceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PortInterfaceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}