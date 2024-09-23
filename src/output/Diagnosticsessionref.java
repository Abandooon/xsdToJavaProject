package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticsessionref extends Ref {

    
    
    protected DiagnosticSessionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSessionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticSessionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}