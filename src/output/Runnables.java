package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Runnables {

    
    
    protected ArrayList<RunnableEntity> runnableEntitys;
    
    

    
    
    @XmlElement(name="RUNNABLE-ENTITY")
    public ArrayList<RunnableEntity> getRunnableEntitys() {
        return this.runnableEntitys;
    }

    public void setRunnableEntitys(ArrayList<RunnableEntity> value) {
        this.runnableEntitys = value;
    }
    
    
}