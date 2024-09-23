package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Currentvalueref extends Ref {

    
    
    protected DiagnosticValueNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticValueNeedsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticValueNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}