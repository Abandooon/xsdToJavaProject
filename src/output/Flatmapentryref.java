package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flatmapentryref extends Ref {

    
    
    protected FlatInstanceDescriptorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlatInstanceDescriptorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlatInstanceDescriptorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}