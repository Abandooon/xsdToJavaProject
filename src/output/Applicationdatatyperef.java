package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Applicationdatatyperef extends Ref {

    
    
    protected ApplicationDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationDataTypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}