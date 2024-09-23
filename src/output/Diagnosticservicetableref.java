package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticservicetableref extends Ref {

    
    
    protected DiagnosticServiceTableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticServiceTableSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticServiceTableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}