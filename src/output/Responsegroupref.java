package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Responsegroupref extends Ref {

    
    
    protected SystemSignalGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSignalGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SystemSignalGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}