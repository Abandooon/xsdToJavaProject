package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Partitions {

    
    
    protected ArrayList<EcuPartition> ecuPartitions;
    
    

    
    
    @XmlElement(name="ECU-PARTITION")
    public ArrayList<EcuPartition> getEcuPartitions() {
        return this.ecuPartitions;
    }

    public void setEcuPartitions(ArrayList<EcuPartition> value) {
        this.ecuPartitions = value;
    }
    
    
}