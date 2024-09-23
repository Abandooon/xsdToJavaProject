package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Readclassref extends Ref {

    
    
    protected DiagnosticReadDataByIdentifierClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDataByIdentifierClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticReadDataByIdentifierClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}