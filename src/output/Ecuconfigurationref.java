package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuconfigurationref extends Ref {

    
    
    protected EcucValueCollectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucValueCollectionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcucValueCollectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}