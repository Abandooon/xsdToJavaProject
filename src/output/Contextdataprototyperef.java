package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contextdataprototyperef extends Ref {

    
    
    protected ApplicationCompositeElementDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationCompositeElementDataPrototypeSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ApplicationCompositeElementDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}