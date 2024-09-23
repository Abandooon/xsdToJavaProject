package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Enableconditiongroupref extends Ref {

    
    
    protected DiagnosticEnableConditionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticEnableConditionGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticEnableConditionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}