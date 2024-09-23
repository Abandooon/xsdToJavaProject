package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Diagnosticstorageconditionref extends Ref {

    
    
    protected DiagnosticStorageConditionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticStorageConditionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticStorageConditionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}