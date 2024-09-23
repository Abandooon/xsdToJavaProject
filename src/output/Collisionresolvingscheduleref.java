package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Collisionresolvingscheduleref extends Ref {

    
    
    protected LinScheduleTableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinScheduleTableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(LinScheduleTableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}