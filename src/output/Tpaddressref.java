package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpaddressref extends Ref {

    
    
    protected TpAddressSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TpAddressSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TpAddressSubtypesEnum value) {
        this.dest = value;
    }
    
    
}