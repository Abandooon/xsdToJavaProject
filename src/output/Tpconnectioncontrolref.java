package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpconnectioncontrolref extends Ref {

    
    
    protected FlexrayTpConnectionControlSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayTpConnectionControlSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(FlexrayTpConnectionControlSubtypesEnum value) {
        this.dest = value;
    }
    
    
}