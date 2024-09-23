package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecuresetclassref extends Ref {

    
    
    protected DiagnosticEcuResetClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEcuResetClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticEcuResetClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}