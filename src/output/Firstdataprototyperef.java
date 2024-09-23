package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Firstdataprototyperef extends Ref {

    
    
    protected AutosarDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarDataPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AutosarDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}