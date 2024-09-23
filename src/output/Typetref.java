package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Typetref extends Ref {

    
    
    protected AutosarDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarDataTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AutosarDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}