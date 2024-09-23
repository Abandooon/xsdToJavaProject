package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requestfiletransferclassref extends Ref {

    
    
    protected DiagnosticRequestFileTransferClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestFileTransferClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticRequestFileTransferClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}