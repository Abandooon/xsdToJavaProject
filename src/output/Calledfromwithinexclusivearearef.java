package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Calledfromwithinexclusivearearef extends Ref {

    
    
    protected ExclusiveAreaNestingOrderSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExclusiveAreaNestingOrderSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ExclusiveAreaNestingOrderSubtypesEnum value) {
        this.dest = value;
    }
    
    
}