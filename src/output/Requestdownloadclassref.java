package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Requestdownloadclassref extends Ref {

    
    
    protected DiagnosticRequestDownloadClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRequestDownloadClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticRequestDownloadClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}