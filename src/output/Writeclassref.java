package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Writeclassref extends Ref {

    
    
    protected DiagnosticWriteDataByIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticWriteDataByIdentifierClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticWriteDataByIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}