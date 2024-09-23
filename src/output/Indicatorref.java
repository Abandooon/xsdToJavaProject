package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Indicatorref extends Ref {

    
    
    protected DiagnosticIndicatorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticIndicatorSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticIndicatorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}