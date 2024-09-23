package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Runnableentityirefs {

    
    
    protected ArrayList<RunnableEntityInCompositionInstanceRef> runnableEntityIrefs;
    
    

    
    
    @XmlElement(name="RUNNABLE-ENTITY-IREF")
    public ArrayList<RunnableEntityInCompositionInstanceRef> getRunnableEntityIrefs() {
        return this.runnableEntityIrefs;
    }

    public void setRunnableEntityIrefs(ArrayList<RunnableEntityInCompositionInstanceRef> value) {
        this.runnableEntityIrefs = value;
    }
    
    
}