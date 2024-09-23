package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Distinguishedpartitions {

    
    
    protected ArrayList<BswDistinguishedPartition> bswDistinguishedPartitions;
    
    

    
    
    @XmlElement(name="BSW-DISTINGUISHED-PARTITION")
    public ArrayList<BswDistinguishedPartition> getBswDistinguishedPartitions() {
        return this.bswDistinguishedPartitions;
    }

    public void setBswDistinguishedPartitions(ArrayList<BswDistinguishedPartition> value) {
        this.bswDistinguishedPartitions = value;
    }
    
    
}