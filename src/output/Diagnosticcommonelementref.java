package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticcommonelementref extends Ref {

    
    
    protected DiagnosticCommonElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticCommonElementSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticCommonElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}