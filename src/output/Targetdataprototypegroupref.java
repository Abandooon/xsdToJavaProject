package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Targetdataprototypegroupref extends Ref {

    
    
    protected DataPrototypeGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataPrototypeGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DataPrototypeGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}