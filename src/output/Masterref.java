package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Masterref extends Ref {

    
    
    protected GlobalTimeMasterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeMasterSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(GlobalTimeMasterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}