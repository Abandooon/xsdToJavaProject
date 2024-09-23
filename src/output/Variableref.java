package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Variableref extends Ref {

    
    
    protected AutosarVariableInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public AutosarVariableInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(AutosarVariableInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}