package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataidentifierref extends Ref {

    
    
    protected DiagnosticDataIdentifierSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataIdentifierSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticDataIdentifierSubtypesEnum value) {
        this.dest = value;
    }
    
    
}