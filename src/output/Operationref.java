package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Operationref extends Ref {

    
    
    protected ClientServerOperationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ClientServerOperationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ClientServerOperationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}