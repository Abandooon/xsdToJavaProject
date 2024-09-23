package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transferexitclassref extends Ref {

    
    
    protected DiagnosticTransferExitClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTransferExitClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticTransferExitClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}