package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Doipsourceaddressref extends Ref {

    
    
    protected LogicAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LogicAddressSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LogicAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}