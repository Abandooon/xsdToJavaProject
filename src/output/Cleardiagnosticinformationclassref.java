package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Cleardiagnosticinformationclassref extends Ref {

    
    
    protected DiagnosticClearDiagnosticInformationClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticClearDiagnosticInformationClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticClearDiagnosticInformationClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}