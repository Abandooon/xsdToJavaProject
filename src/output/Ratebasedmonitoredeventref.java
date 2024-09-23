package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ratebasedmonitoredeventref extends Ref {

    
    
    protected DiagnosticEventNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEventNeedsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticEventNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}