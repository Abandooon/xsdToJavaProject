package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Slaveref extends Ref {

    
    
    protected GlobalTimeSlaveSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GlobalTimeSlaveSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(GlobalTimeSlaveSubtypesEnum value) {
        this.dest = value;
    }
    
    
}