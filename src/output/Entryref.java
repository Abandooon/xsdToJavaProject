package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Entryref extends Ref {

    
    
    protected BswModuleClientServerEntrySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswModuleClientServerEntrySubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(BswModuleClientServerEntrySubtypesEnum value) {
        this.dest = value;
    }
    
    
}