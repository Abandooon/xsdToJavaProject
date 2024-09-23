package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Eventsourceref extends Ref {

    
    
    protected ModeSwitchPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeSwitchPointSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ModeSwitchPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}