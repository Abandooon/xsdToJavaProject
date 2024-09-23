package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Argumentref extends Ref {

    
    
    protected AutosarOperationArgumentInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarOperationArgumentInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AutosarOperationArgumentInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}