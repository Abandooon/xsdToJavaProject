package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Scoperef extends Ref {

    
    
    protected TimingDescriptionEventChainSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimingDescriptionEventChainSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TimingDescriptionEventChainSubtypesEnum value) {
        this.dest = value;
    }
    
    
}