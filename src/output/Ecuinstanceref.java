package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuinstanceref extends Ref {

    
    
    protected EcuInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcuInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcuInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}