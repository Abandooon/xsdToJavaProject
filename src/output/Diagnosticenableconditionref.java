package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticenableconditionref extends Ref {

    
    
    protected DiagnosticEnableConditionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEnableConditionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticEnableConditionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}