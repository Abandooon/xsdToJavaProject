package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Agingref extends Ref {

    
    
    protected DiagnosticAgingSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticAgingSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticAgingSubtypesEnum value) {
        this.dest = value;
    }
    
    
}