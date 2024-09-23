package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnostictroublecoderef extends Ref {

    
    
    protected DiagnosticTroubleCodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticTroubleCodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}