package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticconnectionref extends Ref {

    
    
    protected DiagnosticConnectionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticConnectionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticConnectionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}