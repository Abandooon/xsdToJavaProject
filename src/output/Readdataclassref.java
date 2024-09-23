package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Readdataclassref extends Ref {

    
    
    protected DiagnosticReadDataByPeriodicIdClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDataByPeriodicIdClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticReadDataByPeriodicIdClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}