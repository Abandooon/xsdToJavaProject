package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Partitionref extends Ref {

    
    
    protected EcuPartitionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcuPartitionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(EcuPartitionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}