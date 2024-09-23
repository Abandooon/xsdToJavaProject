package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Applicationrecordelementref extends Ref {

    
    
    protected ApplicationRecordElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationRecordElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationRecordElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}