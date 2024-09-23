package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Physicalchannelref extends Ref {

    
    
    protected PhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PhysicalChannelSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(PhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}