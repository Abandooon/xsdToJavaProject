package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Responseoneventclassref extends Ref {

    
    
    protected DiagnosticResponseOnEventClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticResponseOnEventClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticResponseOnEventClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}