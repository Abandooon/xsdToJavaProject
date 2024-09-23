package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticeventref extends Ref {

    
    
    protected DiagnosticEventSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEventSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticEventSubtypesEnum value) {
        this.dest = value;
    }
    
    
}