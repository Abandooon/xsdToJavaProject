package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Comcontrolclassref extends Ref {

    
    
    protected DiagnosticComControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticComControlClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticComControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}