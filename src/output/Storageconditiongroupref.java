package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Storageconditiongroupref extends Ref {

    
    
    protected DiagnosticStorageConditionGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticStorageConditionGroupSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticStorageConditionGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}