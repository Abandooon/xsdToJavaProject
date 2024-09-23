package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Channelref extends Ref {

    
    
    protected FlexrayPhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayPhysicalChannelSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlexrayPhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}