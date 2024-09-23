package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Regrequiresstabilitys {

    
    
    protected ArrayList<RunnableEntityGroup> runnableEntityGroups;
    
    

    
    
    @XmlElement(name="RUNNABLE-ENTITY-GROUP")
    public ArrayList<RunnableEntityGroup> getRunnableEntityGroups() {
        return this.runnableEntityGroups;
    }

    public void setRunnableEntityGroups(ArrayList<RunnableEntityGroup> value) {
        this.runnableEntityGroups = value;
    }
    
    
}