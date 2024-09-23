package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Timesyncserverref extends Ref {

    
    
    protected TimeSyncServerConfigurationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimeSyncServerConfigurationSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(TimeSyncServerConfigurationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}