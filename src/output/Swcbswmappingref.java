package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swcbswmappingref extends Ref {

    
    
    protected SwcBswMappingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwcBswMappingSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SwcBswMappingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}