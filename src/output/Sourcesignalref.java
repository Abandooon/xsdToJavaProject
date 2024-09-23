package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Sourcesignalref extends Ref {

    
    
    protected ISignalTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalTriggeringSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ISignalTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}