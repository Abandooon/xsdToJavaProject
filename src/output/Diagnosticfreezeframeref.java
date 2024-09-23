package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticfreezeframeref extends Ref {

    
    
    protected DiagnosticFreezeFrameSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticFreezeFrameSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticFreezeFrameSubtypesEnum value) {
        this.dest = value;
    }
    
    
}