package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Schedulernameprefixs {

    
    
    protected ArrayList<BswSchedulerNamePrefix> bswSchedulerNamePrefixs;
    
    

    
    
    @XmlElement(name="BSW-SCHEDULER-NAME-PREFIX")
    public ArrayList<BswSchedulerNamePrefix> getBswSchedulerNamePrefixs() {
        return this.bswSchedulerNamePrefixs;
    }

    public void setBswSchedulerNamePrefixs(ArrayList<BswSchedulerNamePrefix> value) {
        this.bswSchedulerNamePrefixs = value;
    }
    
    
}