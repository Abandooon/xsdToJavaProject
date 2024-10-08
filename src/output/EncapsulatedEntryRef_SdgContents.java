package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EncapsulatedEntryRef_SdgContents extends Ref {

    
    
    protected McDataInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public McDataInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(McDataInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}