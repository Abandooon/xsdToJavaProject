package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Entitys {

    
    
    protected ArrayList<BswCalledEntity> bswCalledEntitys;
    
    
    
    protected ArrayList<BswInterruptEntity> bswInterruptEntitys;
    
    
    
    protected ArrayList<BswSchedulableEntity> bswSchedulableEntitys;
    
    

    
    
    @XmlElement(name="BSW-CALLED-ENTITY")
    public ArrayList<BswCalledEntity> getBswCalledEntitys() {
        return this.bswCalledEntitys;
    }

    public void setBswCalledEntitys(ArrayList<BswCalledEntity> value) {
        this.bswCalledEntitys = value;
    }
    
    
    
    @XmlElement(name="BSW-INTERRUPT-ENTITY")
    public ArrayList<BswInterruptEntity> getBswInterruptEntitys() {
        return this.bswInterruptEntitys;
    }

    public void setBswInterruptEntitys(ArrayList<BswInterruptEntity> value) {
        this.bswInterruptEntitys = value;
    }
    
    
    
    @XmlElement(name="BSW-SCHEDULABLE-ENTITY")
    public ArrayList<BswSchedulableEntity> getBswSchedulableEntitys() {
        return this.bswSchedulableEntitys;
    }

    public void setBswSchedulableEntitys(ArrayList<BswSchedulableEntity> value) {
        this.bswSchedulableEntitys = value;
    }
    
    
}