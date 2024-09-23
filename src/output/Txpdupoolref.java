package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Txpdupoolref extends Ref {

    
    
    protected FlexrayTpPduPoolSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayTpPduPoolSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlexrayTpPduPoolSubtypesEnum value) {
        this.dest = value;
    }
    
    
}