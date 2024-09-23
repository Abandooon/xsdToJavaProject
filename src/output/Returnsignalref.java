package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Returnsignalref extends Ref {

    
    
    protected SystemSignalSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSignalSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SystemSignalSubtypesEnum value) {
        this.dest = value;
    }
    
    
}