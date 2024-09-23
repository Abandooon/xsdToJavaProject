package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Troublecodeudsref extends Ref {

    
    
    protected DiagnosticTroubleCodeUdsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticTroubleCodeUdsSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticTroubleCodeUdsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}