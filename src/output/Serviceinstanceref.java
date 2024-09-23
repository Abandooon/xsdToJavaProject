package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Serviceinstanceref extends Ref {

    
    
    protected DiagnosticServiceInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticServiceInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticServiceInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}