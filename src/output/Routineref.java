package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Routineref extends Ref {

    
    
    protected DiagnosticRoutineSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRoutineSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticRoutineSubtypesEnum value) {
        this.dest = value;
    }
    
    
}