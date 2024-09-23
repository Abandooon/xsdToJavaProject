package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Globaltimepduref extends Ref {

    
    
    protected GeneralPurposePduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public GeneralPurposePduSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(GeneralPurposePduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}