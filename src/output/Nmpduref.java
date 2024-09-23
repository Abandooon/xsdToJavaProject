package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmpduref extends Ref {

    
    
    protected NmPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NmPduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(NmPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}