package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticextendeddatarecordref extends Ref {

    
    
    protected DiagnosticExtendedDataRecordSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticExtendedDataRecordSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticExtendedDataRecordSubtypesEnum value) {
        this.dest = value;
    }
    
    
}