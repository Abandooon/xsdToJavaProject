package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Executableentityref extends Ref {

    
    
    protected ExecutableEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExecutableEntitySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ExecutableEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}