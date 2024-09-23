package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Accesspermissionref extends Ref {

    
    
    protected DiagnosticAccessPermissionSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticAccessPermissionSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticAccessPermissionSubtypesEnum value) {
        this.dest = value;
    }
    
    
}