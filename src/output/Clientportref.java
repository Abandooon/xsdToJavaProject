package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clientportref extends Ref {

    
    
    protected SocketAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SocketAddressSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(SocketAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}