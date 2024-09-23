package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mappingref extends Ref {

    
    
    protected PortInterfaceMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PortInterfaceMappingSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PortInterfaceMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}