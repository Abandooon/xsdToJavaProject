package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Applconstantref extends Ref {

    
    
    protected ConstantSpecificationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ConstantSpecificationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ConstantSpecificationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}