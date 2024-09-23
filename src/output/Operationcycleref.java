package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Operationcycleref extends Ref {

    
    
    protected DiagnosticOperationCycleSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticOperationCycleSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticOperationCycleSubtypesEnum value) {
        this.dest = value;
    }
    
    
}