package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requestuploadclassref extends Ref {

    
    
    protected DiagnosticRequestUploadClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestUploadClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticRequestUploadClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}