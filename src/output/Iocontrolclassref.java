package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Iocontrolclassref extends Ref {

    
    
    protected DiagnosticIoControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticIoControlClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticIoControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}