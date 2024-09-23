package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignaltriggerings {

    
    
    protected ArrayList<ISignalTriggering> iSignalTriggerings;
    
    

    
    
    @XmlElement(name="I-SIGNAL-TRIGGERING")
    public ArrayList<ISignalTriggering> getISignalTriggerings() {
        return this.iSignalTriggerings;
    }

    public void setISignalTriggerings(ArrayList<ISignalTriggering> value) {
        this.iSignalTriggerings = value;
    }
    
    
}