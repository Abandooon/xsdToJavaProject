package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Securityaccessclassref extends Ref {

    
    
    protected DiagnosticSecurityAccessClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSecurityAccessClassSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticSecurityAccessClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}