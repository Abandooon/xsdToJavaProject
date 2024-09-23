package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assignedlinslaveconfigref extends Ref {

    
    
    protected LinSlaveConfigIdentSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinSlaveConfigIdentSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LinSlaveConfigIdentSubtypesEnum value) {
        this.dest = value;
    }
    
    
}