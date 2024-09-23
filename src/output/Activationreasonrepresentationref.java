package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Activationreasonrepresentationref extends Ref {

    
    
    protected ExecutableEntityActivationReasonSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExecutableEntityActivationReasonSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ExecutableEntityActivationReasonSubtypesEnum value) {
        this.dest = value;
    }
    
    
}