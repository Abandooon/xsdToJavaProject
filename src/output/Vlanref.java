package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Vlanref extends Ref {

    
    
    protected EthernetPhysicalChannelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EthernetPhysicalChannelSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EthernetPhysicalChannelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}