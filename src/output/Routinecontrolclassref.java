package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Routinecontrolclassref extends Ref {

    
    
    protected DiagnosticRoutineControlClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticRoutineControlClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticRoutineControlClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}