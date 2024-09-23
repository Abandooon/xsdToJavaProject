package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Securitylevelref extends Ref {

    
    
    protected DiagnosticSecurityLevelSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticSecurityLevelSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(DiagnosticSecurityLevelSubtypesEnum value) {
        this.dest = value;
    }
    
    
}