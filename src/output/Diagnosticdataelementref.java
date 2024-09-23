package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticdataelementref extends Ref {

    
    
    protected DiagnosticDataElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticDataElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}