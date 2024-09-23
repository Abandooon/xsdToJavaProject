package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Cantpchannelref extends Ref {

    
    
    protected CanTpChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanTpChannelSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(CanTpChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}