package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Freezeframecontentref extends Ref {

    
    
    protected DiagnosticDataIdentifierSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticDataIdentifierSetSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticDataIdentifierSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}